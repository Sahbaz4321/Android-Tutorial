package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




//Design an activity with the option profile and setting  as icon in the action bar in profile provide the option to change theme and password
//switch the background color or theme between dark and light when change theme is clicked
class Practice_class : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.practice_class)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val name=findViewById<EditText>(R.id.enter_name)
        val number=findViewById<EditText>(R.id.enter_number)
      val  n=name.text.toString()
        val btn=findViewById<Button>(R.id.call_btn)
        btn.setOnClickListener{
            val intent= Intent(Intent.ACTION_DIAL)

            val mobile=number.text.toString()
            intent.data= Uri.parse("tel:$mobile")

            startActivity(intent)
        }
//        Toast.makeText(this,"you call $n",Toast.LENGTH_LONG).show()


    }
}