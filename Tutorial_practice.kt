package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tutorial_practice : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tutorial_practice)

        val btn=findViewById<Button>(R.id.toast)
        btn.setOnClickListener{
            val toast=Toast.makeText(this,"hello", Toast.LENGTH_LONG)
//            toast.duration=5000
            toast.show()

//            Handler is a mechanism to send and process message
//            lOOPER IS A CLASS THAT ALLOW THREAD TO PROCESS MESSAGE IN A LOOP

            Handler(Looper.getMainLooper()).postDelayed({
                toast.cancel()
            },5000)
//            how to custome timer in toast


        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}