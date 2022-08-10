package com.example.youtube1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainKayitOl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kayit_ol)
        val button = findViewById<Button>(R.id.btngirisedön)
        button.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.btnkaydet)
        button1.setOnClickListener {
            val intent = Intent(applicationContext, MainHosGeldiniz::class.java)
            startActivity(intent)
        }

    }
}
