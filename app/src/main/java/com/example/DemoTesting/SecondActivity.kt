package com.example.DemoTesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        val button = findViewById<Button>(R.id.btn)
        val text1 = findViewById<EditText>(R.id.tvName).text
        val text2 = findViewById<EditText>(R.id.tvAge).text
        button.setOnClickListener{
            var intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("value", "$text1 $text2")
            startActivity(intent)
        }
    }
}