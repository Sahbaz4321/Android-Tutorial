package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class Practice6 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.practice6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn=findViewById<Button>(R.id.btn_snack)
        btn.setOnClickListener{
            val snackbar=Snackbar.make(it,"you clicked button", Snackbar.LENGTH_LONG).setAction("*"){
               val toast= Toast.makeText(this,"you close it ",Toast.LENGTH_LONG).show()


            }
            snackbar.setTextColor(R.color.white)
            snackbar.setBackgroundTint(R.color.teal_200)

            snackbar.show()
        }
    }
}