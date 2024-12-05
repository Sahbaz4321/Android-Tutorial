package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.telecom.Call
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class explicit : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_explicit)
        val btn2=findViewById<Button>(R.id.implicit)
        val btn1=findViewById<Button>(R.id.explicit)
        btn1.setOnClickListener {


            val intent = Intent(this, textToggleVIew::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener{
            val url="https://www.youtube.com"
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            startActivity(intent)
        }


        val dialer=findViewById<Button>(R.id.dialer)
        dialer.setOnClickListener{
            val number="12345"
            val intent=Intent(Intent.ACTION_DIAL)
            intent.data=Uri.parse("tel:$number")
            startActivity(intent)

        }

        val text_msg=findViewById<Button>(R.id.text_date)
        text_msg.setOnClickListener{
            val smsNumber="12345"
            val smsText="Hello how are you"
            val intent=Intent(Intent.ACTION_SENDTO)
            intent.data=Uri.parse("sms:$smsNumber")
            intent.putExtra("sms_body",smsText)
            startActivity(intent)

        }
//        val map_btn=findViewById<Button>(R.id.maps)
//        map_btn.setOnClickListener{
//            val location=''
//            val intent=Intent(Intent.ACTION_VIEW)
//            intent.data=Uri.parse(location)
//            startActivity(intent)
//        }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}