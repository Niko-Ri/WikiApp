package com.example.wikiapp.mainmenu.submenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.wikiapp.R
import com.example.wikiapp.mainmenu.PhysicsMenu

class ElectricMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electric_menu)

        var btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, PhysicsMenu::class.java)
            startActivity(intent)
            finish()
        }
    }
}