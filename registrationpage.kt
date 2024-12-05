//package com.example.loginactivity
//
//import android.annotation.SuppressLint
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class registrationpage : AppCompatActivity() {
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_registrationpage)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
////
////        val user=findViewById<EditText>(R.id.user_name)
////        val pass=findViewById<EditText>(R.id.password_user)
////        val btn=findViewById<Button>(R.id.login_page_btn)
////        val forgot_password=findViewById<TextView>(R.id.forgot_password)
////        val google=findViewById<ImageView>(R.id.google)
////        val facebook=findViewById<ImageView>(R.id.facebook)
////        val instagram=findViewById<ImageView>(R.id.instagram)
//
////        btn.setOnClickListener {
//
////            val username = user.text.toString()
////            val password = pass.text.toString()
//            val intent = Intent(this, dataStore::class.java).apply {
//
////                putExtra("Username", username)
////                putExtra("Password", password)
//            }
//
//
//            startActivity(intent)
//
//        }
//
//    }
//}