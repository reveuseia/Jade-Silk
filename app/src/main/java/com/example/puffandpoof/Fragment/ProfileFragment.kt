package com.example.puffandpoof.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.puffandpoof.databinding.FragmentProfileBinding
import android.content.SharedPreferences
import android.content.Context
import com.example.puffandpoof.LoginActivity
import com.example.puffandpoof.MapsActivity

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)

        sharedPreferences = requireActivity().getSharedPreferences("user_info", Context.MODE_PRIVATE)

        val storedUsername = sharedPreferences.getString("username", "")
        val storedEmail = sharedPreferences.getString("email", "")
        val storedPhoneNumber = sharedPreferences.getString("phoneNumber", "")

        binding.usernameTextView.text = storedUsername
        binding.emailTextView.text = storedEmail
        binding.phoneTextView.text = storedPhoneNumber

        binding.logoutButton.setOnClickListener {
            logout()
        }

        binding.MapButton.setOnClickListener {
            navigateToMapsActivity()
        }

        return binding.root
    }

    private fun logout() {
        val intent = Intent(activity, LoginActivity::class.java)
        startActivity(intent)
        activity?.finish()
    }

    private fun navigateToMapsActivity() {
        val intent = Intent(activity, MapsActivity::class.java)
        startActivity(intent)
    }
}