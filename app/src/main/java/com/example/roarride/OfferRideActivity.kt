package com.example.roarride

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class OfferRideActivity : AppCompatActivity() {
    private lateinit var startDestination: EditText
    private lateinit var dateAndTime: EditText
    private lateinit var pricePerSeat: EditText
    private lateinit var offerRideButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.offer_ride)

        startDestination = findViewById(R.id.editTextStartDestination)
        dateAndTime = findViewById(R.id.editTextDateAndTime)
        pricePerSeat = findViewById(R.id.editTextPricePerSeat)
        offerRideButton = findViewById(R.id.buttonOfferRide)

        offerRideButton.setOnClickListener {
            val startDest = startDestination.text.toString().trim()
            val dateTime = dateAndTime.text.toString().trim()
            val price = pricePerSeat.text.toString().trim()

            if (startDest.isNotEmpty() && dateTime.isNotEmpty() && price.isNotEmpty()) {
                Toast.makeText(this, "Ride offered from $startDest on $dateTime at $price per seat.", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please fill in all fields.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
