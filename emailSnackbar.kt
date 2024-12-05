//package com.example.myapplication
//
//import android.content.Intent
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.EditText
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import com.google.android.material.snackbar.Snackbar
//
//class emailSnackbar : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_email_snackbar)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//
//        val user=findViewById<EditText>(R.id.user)
//        val pass=findViewById<EditText>(R.id.password)
//
//        val btn=findViewById<Button>(R.id.btn)
//
//        val username="sahbaz"
//        val password="1234"
//
//        fun checkDetail(){
//            val name=user.text.toString()
//            val key=pass.text.toString()
//
//            if(username==name && password==key){
//                val intent= Intent(this,Dashboard::class.java)
//                startActivity(intent)
//
//            }
//            else{
//                fun snackbar(view: View){
//                    val snacbar_layout: View =findViewById(R.id.main)
//                    snackbar(view,"error occured",Snackbar.LENGTH_INDEFINITE)
//
//
//
//                }
//            }
//        }
//
//    }
//}