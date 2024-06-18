package com.example.puffandpoof

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        val yesButton: Button = findViewById(R.id.yesButton)
        yesButton.setOnClickListener {
            // Redirect to login page when the Yes button is clicked
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // Close the current activity
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker at PuFF and Poof's location and move the camera
        val puffAndPoof = LatLng(-6.224569879030299, 106.81108768434319)
        mMap.addMarker(MarkerOptions().position(puffAndPoof).title("Intellectra"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(puffAndPoof, 15f))
    }
}
