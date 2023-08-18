package com.example.wikiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnMechanic = findViewById<Button>(R.id.btnMechanic)
        btnMechanic.setOnClickListener {

        }
    }

}
