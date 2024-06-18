package com.example.puffandpoof

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.os.Bundle
import android.telephony.SmsManager
import android.text.method.PasswordTransformationMethod
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.puffandpoof.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var sharedPreferences: SharedPreferences
    private var isPasswordVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences("user_info", Context.MODE_PRIVATE)

        // Set click listener for the login button
        binding.LoginBT.setOnClickListener {
            val username = binding.usernameField.text.toString().trim()
            val password = binding.passField.text.toString().trim()

            // Validate username and password fields
            if (validateInput(username, password)) {
                // Authenticate user
                if (authenticateUser(username, password)) {
                    val phoneNumber = sharedPreferences.getString("phoneNumber", "")
                    if (phoneNumber.isNullOrEmpty()) {
                        showToast("No phone number associated with this user")
//                    val intent1 = Intent(this, MainActivity::class.java)
//                    startActivity(intent1)
                    } else {
                        val otp = generateOtp()
                        sendOtp(phoneNumber, otp)
                        navigateToOtpPage(otp)
//                        Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

        // Set click listener for the "Register here" text view
        binding.RegisterBT.setOnClickListener {
            // Redirect to RegisterActivity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun validateInput(username: String, password: String): Boolean {
        if (username.isEmpty()) {
            Toast.makeText(this, "Username must be filled", Toast.LENGTH_SHORT).show()
            return false
        }
        if (password.isEmpty()) {
            Toast.makeText(this, "Password must be filled", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

    // Function to authenticate user
    private fun authenticateUser(username: String, password: String): Boolean {
        // Retrieve stored credentials
        val storedUsername = sharedPreferences.getString("username", "")
        val storedPassword = sharedPreferences.getString("password", "")

        // Compare provided credentials with stored credentials after trimming
        val trimmedStoredUsername = storedUsername?.trim()
        val trimmedStoredPassword = storedPassword?.trim()

        return if (username == trimmedStoredUsername && password == trimmedStoredPassword) {
            showToast("Welcome, $username!")
            true
        } else {
            showToast("Incorrect Username or Password")
            false
        }
    }

    private fun generateOtp(): String {
        return (1000..9999).random().toString()
    }

    private fun sendOtp(phoneNumber: String, otp: String) {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.SEND_SMS), 1)
        } else {
            try {
                val smsManager = SmsManager.getDefault()
                smsManager.sendTextMessage(phoneNumber, null, "Your OTP code is: $otp", null, null)
                Toast.makeText(this, "OTP sent", Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                Toast.makeText(this, "Failed to send OTP: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun navigateToOtpPage(otp: String) {
        val intent = Intent(this, OtpActivity::class.java)
        intent.putExtra("OTP_CODE", otp)
        startActivity(intent)
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1 && grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            val username = binding.usernameField.text.toString().trim()
            val otp = generateOtp()
            val phoneNumber = sharedPreferences.getString("phoneNumber", "")
            if (!phoneNumber.isNullOrEmpty()) {
                sendOtp(phoneNumber, otp)
            } else {
                showToast("No phone number associated with this user")
            }
        } else {
            Toast.makeText(this, "Permission denied to send SMS", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}




