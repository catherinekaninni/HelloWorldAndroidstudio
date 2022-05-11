package com.example.hello_world

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBMI: Button
    lateinit var btnMoney: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBMI = findViewById(R.id.btnBmi)
        btnMoney = findViewById(R.id.btnsend)
        btnBMI.setOnClickListener {
            val intent = Intent(this, calculate_BMI_Activity::class.java)
            startActivity(intent)
        }

        btnMoney.setOnClickListener {
            val intent = Intent(this, Money_Activity::class.java)
            startActivity(intent)
        }
    }
}