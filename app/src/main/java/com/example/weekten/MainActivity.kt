package com.example.weekten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfCountries = listOf<String>("+234", "+233","+966" )
        findViewById<Spinner>(R.id.spinner).adapter= ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,
            listOfCountries)


    }
}