package com.example.myapplication

import android.os.Bundle

import android.net.Uri
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class intentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent)

//explicit activity

        val implicit_btn1=findViewById<Button>(R.id.btn1)
        implicit_btn1.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

//        action_view, action_dial,action_sendto,action_setting,
//        implicit activity code
        val explicit_btn2=findViewById<Button>(R.id.btn2)
        explicit_btn2.setOnClickListener{
            val intent=Intent.ACTION_VIEW
            val url="https://www.google.com"



        }





//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}