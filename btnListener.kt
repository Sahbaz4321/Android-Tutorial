package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class btnListener : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.btn_listener)


        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            Toast.makeText(this,"you clicked this button",Toast.LENGTH_LONG).show()

        }
        val check=findViewById<CheckBox>(R.id.check_box)
        check.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)  {


                Toast.makeText(this, "you cliced checke box", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"not checked",Toast.LENGTH_LONG).show()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}