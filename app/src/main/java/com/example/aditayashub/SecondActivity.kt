package com.example.aditayashub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val Ad = findViewById<TextView>(R.id.Ad)
        val Wd = findViewById<TextView>(R.id.Wd)
        val Id = findViewById<TextView>(R.id.Id)
        val Fsd = findViewById<TextView>(R.id.Fsd)
        val Ml = findViewById<TextView>(R.id.Ml)
        val  Iot = findViewById<TextView>(R.id.Iot)
        val Call = findViewById<Button>(R.id.Call)

        Ad.setOnClickListener {
            intent = Intent(applicationContext, Android::class.java)
            startActivity(intent)
        }

        Wd.setOnClickListener {
            intent = Intent(applicationContext, Web::class.java)
            startActivity(intent)
        }

        Id.setOnClickListener {
            intent = Intent(applicationContext, IOS::class.java)
            startActivity(intent)
        }

        Fsd.setOnClickListener {
            intent = Intent(applicationContext, FullStack::class.java)
            startActivity(intent)
        }

        Ml.setOnClickListener {
            intent = Intent(applicationContext, MachineLearning::class.java)
            startActivity(intent)
        }

        Iot.setOnClickListener {
            intent = Intent(applicationContext, IOT::class.java)
            startActivity(intent)
        }

        Call.setOnClickListener {

            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:" + "6360847309")
            startActivity(callIntent)
        }

        val Backk = findViewById<Button>(R.id.Back)

        Backk.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)

        }


    }
}