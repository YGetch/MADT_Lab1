package com.example.madt_lab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvMainText = findViewById<TextView>(R.id.tvMainText)
        val btnChangeText = findViewById<Button>(R.id.btnChangeText)

        btnChangeText.setOnClickListener {
            tvMainText.text = "Text Changed!"
        }
    }
}