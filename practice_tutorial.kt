package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class practice_tutorial : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.practice_tutorial)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val firstname=findViewById<EditText>(R.id.first)
        val lastname=findViewById<EditText>(R.id.last)

        val btn=findViewById<Button>(R.id.submit)






        val spinner=findViewById<Spinner>(R.id.spinner_plate)
        val arr=arrayOf("Aligarh","Noida","delhi","punjab")
        val adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter=adapter

        var cities=""
        spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
               cities=parent?.getItemAtPosition(position).toString()
//                Toast.makeText(search_bar,"$parent city selected",Toast.LENGTH_LONG).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }




        }
        btn.setOnClickListener{

            val name=firstname.text.toString()
            val lastn=lastname.text.toString()
//            text1.text=name
//            text2.text=lastn
//            text3.text="$selected city selected"

            val intent=Intent(this@practice_tutorial,practice_1::class.java).apply {
                putExtra("First Name",name)
                putExtra("Last Name",lastn)
                putExtra("city",cities)
            }
            startActivity(intent)

        }

    }
}