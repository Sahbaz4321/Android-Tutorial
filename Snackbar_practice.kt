package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.TopAppBar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class Snackbar_practice : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.snackbar_practice)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn=findViewById<Button>(R.id.btn_snackbar)
        btn.setOnClickListener{
            val snack= Snackbar.make(it,"you clicked",Snackbar.LENGTH_INDEFINITE).setAction("*"){
                Toast.makeText(this,"you crossed",Toast.LENGTH_LONG).show()
            }
            snack.setTextColor(R.color.purple_200)
            snack.setBackgroundTint(R.color.teal_200)
            snack.show()

        }

    }
}