package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class _login_page : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout._login_page2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val user=findViewById<EditText>(R.id.userdata)
        val pass=findViewById<EditText>(R.id.password_data)
        val btn=findViewById<Button>(R.id.login_button)
        val forgot_password=findViewById<TextView>(R.id.forgotPassword)
        btn.setOnClickListener{


            val username=user.text.toString()
            val password=pass.text.toString()
            val intent= Intent(this,homemenu1::class.java)
//                .apply{
//                putExtra("Username",username)
//                putExtra("Password",password)
//            }
            startActivity(intent)
        }


//        password
        forgot_password.setOnClickListener{
            val intent=Intent(this,forgotPassword::class.java)
            startActivity(intent)
        }

    }
}