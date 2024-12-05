package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp_page : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.sign_up_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val city=findViewById<Spinner>(R.id.city)
        val arr= arrayOf("Aligarh","Jalandhar","Phagwara")
        val arr_adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr)
        city.adapter=arr_adapter

        val sign=findViewById<Button>(R.id.sign_up)
        sign.setOnClickListener{
            val intent= Intent(this,homemenu1::class.java)
            startActivity(intent)
        }

    }

}