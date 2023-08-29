package com.example.wikiapp.mainmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.wikiapp.MainActivity
import com.example.wikiapp.R
import com.example.wikiapp.mainmenu.submenu.ElectricMenu
import com.example.wikiapp.mainmenu.submenu.MechanicMenu

class PhysicsMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physics_menu)

        var btnElectric = findViewById<Button>(R.id.btnElectric)
        btnElectric.setOnClickListener {
            val intent = Intent(this, ElectricMenu::class.java)
            startActivity(intent)
            finish()
        }

        var btnMechanic = findViewById<Button>(R.id.btnMechanic)
        btnMechanic.setOnClickListener {
            val intent = Intent(this, MechanicMenu::class.java)
            startActivity(intent)
            finish()
        }

        var btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}