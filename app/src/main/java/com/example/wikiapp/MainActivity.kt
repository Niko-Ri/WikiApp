package com.example.wikiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.wikiapp.mainmenu.ComputerScienceMenu
import com.example.wikiapp.mainmenu.MathMenu
import com.example.wikiapp.mainmenu.PhysicsMenu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnComputerScience = findViewById<Button>(R.id.btnComputerScience)
        btnComputerScience.setOnClickListener {
            val intent = Intent(this, ComputerScienceMenu::class.java)
            startActivity(intent)
            finish()
        }

        var btnMath = findViewById<Button>(R.id.btnMath)
        btnMath.setOnClickListener {
            val intent = Intent(this, MathMenu::class.java)
            startActivity(intent)
            finish()
        }

        var btnPhysics = findViewById<Button>(R.id.btnPhysics)
        btnPhysics.setOnClickListener {
            val intent = Intent(this, PhysicsMenu::class.java)
            startActivity(intent)
            finish()
        }
    }
}
