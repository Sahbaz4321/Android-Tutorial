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

class SendDataToOtherActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.send_data_to_other)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//
//        val name=findViewById<EditText>(R.id.enter_name)
//        val pass=findViewById<EditText>(R.id.enter_password)
//        val age=findViewById<EditText>(R.id.enter_age)
//        val btn=findViewById<Button>(R.id.enter_btn)


//        btn.setOnClickListener{
//            val firstname=name.text.toString()
//            val password=pass.text.toString()
//            val age_data=age.text.toString()
//
//            val intent= Intent(this,ReceiveData::class.java).apply{
//                putExtra("Name",firstname)
//                putExtra("Password",password)
//                putExtra("Age",age_data)
//
//            }
//            startActivity(intent)
//        }


        val user=findViewById<EditText>(R.id.user_name)
        val pass=findViewById<EditText>(R.id.password_user)
        val btn=findViewById<Button>(R.id.login_page_btn)
        val forgot_password=findViewById<TextView>(R.id.forgot_password)
        btn.setOnClickListener {

            val username = user.text.toString()
            val password = pass.text.toString()
            val intent = Intent(this, ReceiveData::class.java).apply {

                putExtra("Username", username)
                putExtra("Password", password)
            }


            startActivity(intent)

        }
    }
}