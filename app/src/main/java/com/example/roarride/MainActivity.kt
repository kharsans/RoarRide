package com.example.roarride

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEdgeToEdge()

        val findRideButton = findViewById<Button>(R.id.findRideButton)
        val offerRideButton = findViewById<Button>(R.id.offerRideButton)

        findRideButton.setOnClickListener {
            startActivity(Intent(this, FindRideActivity::class.java))
        }

        offerRideButton.setOnClickListener {
            startActivity(Intent(this, OfferRideActivity::class.java))
        }
    }

    private fun setupEdgeToEdge() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            WindowInsetsCompat.CONSUMED
        }
    }
}
