package com.example.smartcabreservation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RideDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ride_details)

        val btnConfirm = findViewById<Button>(R.id.btnConfirmRide)
        btnConfirm.setOnClickListener {
            startActivity(Intent(this, TrackingActivity::class.java))
        }
    }
}
