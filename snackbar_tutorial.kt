package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.graphics.Color
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar


class snackbar_tutorial : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.snackbar_tutorial)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn=findViewById<Button>(R.id.snackbar_btn)
//   btn.setOnClickListener{
//       val snackbar= Snackbar.make(it,"you clicked button",Snackbar.LENGTH_LONG).setAction("x"){
//           Toast.makeText(this,"you cut it",Toast.LENGTH_LONG).show()
//
//       }.show()
//   }

        btn.setOnClickListener{

            val snackbar= Snackbar.make(it,"you clicked button",Snackbar.LENGTH_LONG).setAction("x"){
                Toast.makeText(this,"you cut it",Toast.LENGTH_LONG).show()

            }
       val snackbar_view=snackbar.view
//            snackbar_view.setBackgroundColor(Color.Cyan)


            snackbar.show()

        }


    }

}