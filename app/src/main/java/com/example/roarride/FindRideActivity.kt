package com.example.roarride

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView

class FindRideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.find_ride)

        val listView: ListView = findViewById(R.id.listViewRides)
        val rides = arrayOf("Ride 1: City A to City B", "Ride 2: City C to City D") // Example data

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, rides)
        listView.adapter = adapter
    }
}
