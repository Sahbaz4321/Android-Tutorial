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

class implicit_Explicit_Intent : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.implicit_explicit_intent)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val implicit=findViewById<Button>(R.id.implicit_intent)
        val explicit=findViewById<Button>(R.id.explicit_intent)
        val dialer=findViewById<Button>(R.id.dial)
        val msg=findViewById<Button>(R.id.message_btn)
        val map=findViewById<Button>(R.id.map)


        explicit.setOnClickListener{
            val intent= Intent(this,_login_page::class.java)
            startActivity(intent)
        }
        implicit.setOnClickListener{
//            val url="https://www.youtube.com"
            val url="https://chatgpt.com/"
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            startActivity(intent)
        }
        dialer.setOnClickListener{
            val number="12345"
            val intent=Intent(Intent.ACTION_DIAL)
            intent.data=Uri.parse("tel:$number")
            startActivity(intent)
        }
        msg.setOnClickListener{
            val number="7055098350"
            val text="Hello how are you"
            val intent=Intent(Intent.ACTION_SENDTO)
            intent.data= Uri.parse("sms:$number")
            intent.putExtra("sms_body",text)
            startActivity(intent)
        }
        map.setOnClickListener{

//            val location="https://maps.app.goo.gl/iTyR4TEgjymNGuBz5"
            val location="geo:31°15'20.375°42'17.3"
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse(location)
            startActivity(intent)
        }
    }
}