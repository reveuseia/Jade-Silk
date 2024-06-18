package com.example.puffandpoof

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.puffandpoof.databinding.ActivityOtpBinding

class OtpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOtpBinding
    private lateinit var receivedOtp: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        receivedOtp = intent.getStringExtra("OTP_CODE") ?: ""

        // Show OTP code in a toast message
        Toast.makeText(this, "Your OTP code is: $receivedOtp", Toast.LENGTH_LONG).show()

        binding.verifyButton.setOnClickListener {
            val enteredOtp = binding.otpEditText.text.toString().trim()
            if (verifyOtp(enteredOtp)) {
                navigateToHomePage()
            } else {
                Toast.makeText(this, "Invalid OTP", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun verifyOtp(enteredOtp: String): Boolean {
        return enteredOtp == receivedOtp
    }

    private fun navigateToHomePage() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}


