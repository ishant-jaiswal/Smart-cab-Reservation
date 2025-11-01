package com.example.smartcabreservation

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TrackingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracking)

        val bookButton = findViewById<Button>(R.id.btnBookRide)
        bookButton.setOnClickListener {
            Toast.makeText(this, "Ride Booked Successfully!", Toast.LENGTH_SHORT).show()
        }
    }
}

