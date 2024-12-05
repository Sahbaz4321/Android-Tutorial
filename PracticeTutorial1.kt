package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticeTutorial1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.practice_tutorial1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val checkbox1=findViewById<CheckBox>(R.id.cricket1)
        val checkbox2=findViewById<CheckBox>(R.id.football1)
        val checkbox3=findViewById<CheckBox>(R.id.basketball)
        val btn=findViewById<Button>(R.id.btn_check)
        btn.setOnClickListener{
            val hobby= mutableListOf<String>();
            if(checkbox1.isChecked) hobby.add("cricket")
            if(checkbox2.isChecked) hobby.add("football")
            if(checkbox3.isChecked) hobby.add("basketball")

            if(hobby.isNotEmpty()){
//                Toast.makeText(this,"you checked $hobby",Toast.LENGTH_LONG).show()

                Toast.makeText(
                    this,
                    "Selected Hobbies: ${hobby.joinToString(", ")}",
                    Toast.LENGTH_LONG
                ).show()
            }


        }

    }
}