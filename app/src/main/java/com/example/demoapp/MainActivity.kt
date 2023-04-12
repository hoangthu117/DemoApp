package com.example.demoapp

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculator = Calculator()
        val calculateButton: Button = findViewById(R.id.calculateButton)
        val number1EditText: EditText = findViewById(R.id.number1EditText)
        val number2EditText: EditText = findViewById(R.id.number2EditText)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        calculateButton?.setOnClickListener {
            val number1 = number1EditText.text.toString().toInt()
            val number2 = number2EditText.text.toString().toInt()
            val result = calculator.add(number1, number2)
            resultTextView.text = result.toString()
        }
    }
}