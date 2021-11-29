package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btKotln : Button
    lateinit var btAndriod : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btKotln = findViewById(R.id.btKotlinContent)
        btAndriod = findViewById(R.id.btAndroidContent)

        btKotln.setOnClickListener {
            val intent = Intent(this, KotlinContent::class.java)
            startActivity(intent)
        }
        btAndriod.setOnClickListener {
            val intent = Intent(this, AndroidContent::class.java)
            startActivity(intent)
        }
    }
}