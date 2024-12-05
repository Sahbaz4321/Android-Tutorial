package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReceiveData : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.receive_data)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val textd=findViewById<TextView>(R.id.textdata)
//        val name=intent.getStringExtra("Name")
//        val age=intent.getStringExtra("Age")
//        val password=intent.getStringExtra("Password")
//
//        textd.text="Name is : $name and age is $age and password is : $password"
                val textview1=findViewById<TextView>(R.id.text1)
        val textview2=findViewById<TextView>(R.id.text2)

       val name = intent.getStringExtra("Username")
        val password=intent.getStringExtra("Password")

        textview1.text="Name is : $name"
        textview2.text="Password is : $password"

    }
}