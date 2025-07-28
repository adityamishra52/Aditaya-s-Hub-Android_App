package com.example.aditayashub

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val GoButton = findViewById<Button>(R.id.Gobutton)

        GoButton.setOnClickListener {

             intent= Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}