package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Implicit_Intent : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.implicit_intent)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val dial=findViewById<Button>(R.id.implicit_dial)
//        dial.setOnClickListener{
//            val number="1234"
//            val intent= Intent(Intent.ACTION_DIAL)
//
//            intent.data= Uri.parse("tel:$number")
//            startActivity(intent)
//        }
        dial.setOnClickListener{
             val location="geo:31°15'20.375°42'17.3"
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse(location)
            startActivity(intent)
        }

//        dial.setOnClickListener{
//            val url="https://www.youtube.com"
//            val intent=Intent(Intent.ACTION_VIEW)
//            intent.data=Uri.parse(url)
//            startActivity(intent)
//        }

//        dial.setOnClickListener{
//            val number="1234"
//            val text="hi how are you"
//            val intent=Intent(Intent.ACTION_SENDTO)
//            intent.data=Uri.parse("sms:$number")
//            intent.putExtra("sms_body",text)
//            startActivity(intent)
//        }
    }
}