package com.example.youtube1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btngirisyap)
        button.setOnClickListener {
            val intent = Intent(applicationContext, MainHosGeldiniz::class.java)
            startActivity(intent)

        }
        val button1 = findViewById<Button>(R.id.btnkayitol)
        button1.setOnClickListener {
            val intent = Intent(applicationContext, MainKayitOl::class.java)
            startActivity(intent)
        }

    }
}
