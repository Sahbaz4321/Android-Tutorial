package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GridLayout1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.grid_layout1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        for(i  in 1..9){
            val buttonId="btn_grid$i"
            val rewsId=resources.getIdentifier(buttonId,"id",packageName)
            val button=findViewById<Button>(rewsId)
            button.setOnClickListener{
                Toast.makeText(this,"toy selected ${button.text}",Toast.LENGTH_LONG).show()
            }
        }

    }
}