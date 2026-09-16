package com.example.madt_lab1

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(ActivityLifecycleObserver())
        Log.i(TAG, "MainActivity: onCreate triggered")

        val tvMainText = findViewById<TextView>(R.id.tvMainText)
        val btnChangeText = findViewById<Button>(R.id.btnChangeText)
        val btnChangeColor = findViewById<Button>(R.id.btnChangeColor)
        val btnChangeBg = findViewById<Button>(R.id.btnChangeBg)
        val mainLayout = window.decorView.rootView

        btnChangeText.setOnClickListener {
            tvMainText.text = "Text Changed!"
        }

        btnChangeColor.setOnClickListener {
            tvMainText.setTextColor(Color.RED)
        }

        btnChangeBg.setOnClickListener {
            window.decorView.rootView.setBackgroundColor(Color.YELLOW)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "MainActivity: onStart triggered")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "MainActivity: onResume triggered")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "MainActivity: onPause triggered")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "MainActivity: onStop triggered")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "MainActivity: onDestroy triggered")
    }

    companion object {
        private const val TAG = "MainActivityLifecycle"
    }
}

// Code for revert