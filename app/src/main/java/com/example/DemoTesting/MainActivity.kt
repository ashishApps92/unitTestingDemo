package com.example.DemoTesting

import android.app.Notification.Action
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.DemoTesting.androidUtils.AndroidHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //AndroidHelper().showToastMessage(this, "hi bro")
        val button1 = findViewById<Button>(R.id.btn1)
        val button2 = findViewById<Button>(R.id.btn2)
        var count = 0;
        button1.setOnClickListener{
            count++
            findViewById<TextView>(R.id.tvMsg).text = "count $count"
        }
        button2.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            startActivity(Intent.createChooser(intent, "share..."));
        }
    }
}