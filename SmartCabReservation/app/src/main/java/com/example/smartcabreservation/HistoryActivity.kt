package com.example.smartcabreservation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray
import org.json.JSONObject

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val pickupField = findViewById<EditText>(R.id.edtPickup)
        val destinationField = findViewById<EditText>(R.id.edtDestination)
        val findCabButton = findViewById<Button>(R.id.btnFindCab)

        findCabButton.setOnClickListener {
            val pickup = pickupField.text.toString()
            val destination = destinationField.text.toString()

            if (pickup.isEmpty() || destination.isEmpty()) {
                Toast.makeText(this, "Please fill both fields", Toast.LENGTH_SHORT).show()
            } else {
                sendDataToMLServer(pickup, destination)
            }
        }
    }

    private fun sendDataToMLServer(pickup: String, destination: String) {
        val queue = Volley.newRequestQueue(this)
        val url = "http://192.168.1.5:5000/cluster" // Replace with your PC IP

        val jsonBody = JSONObject()
        val usersArray = JSONArray()
        val userObj = JSONObject()

        // Dummy lat/lon (replace later with GPS)
        userObj.put("pickup", JSONArray(listOf(28.61, 77.20)))
        userObj.put("dest", JSONArray(listOf(28.70, 77.10)))
        userObj.put("time", 540)

        usersArray.put(userObj)
        jsonBody.put("users", usersArray)

        val request = JsonObjectRequest(
            Request.Method.POST, url, jsonBody,
            { response ->
                Toast.makeText(this, "Cluster Result: $response", Toast.LENGTH_LONG).show()
            },
            { error ->
                Toast.makeText(this, "Error: ${error.message}", Toast.LENGTH_LONG).show()
            }
        )

        queue.add(request)
    }
}

