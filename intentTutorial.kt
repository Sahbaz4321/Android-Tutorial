package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class intentTutorial : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent_tutorial)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val text1=findViewById<TextView>(R.id.textfe)
   val d=intent.getStringExtra("data")
        text1.text=d




        val spin=findViewById<Spinner>(R.id.spinner_1)
        val arr=arrayOf("Bmw","hi","fi")
        val arr_adapter= ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr)
        arr_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spin.adapter=arr_adapter

        spin.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selected_parent=parent?.getItemAtPosition(position).toString()
                Toast.makeText(parent?.context,"you click $selected_parent",Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }



        val btn=findViewById<Button>(R.id.implicit_button)
        btn.setOnClickListener{
            val number="12345"
            val intent= Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:$number")
            startActivity(intent)
        }
val hindi=findViewById<Button>(R.id.hindi)
        val english=findViewById<Button>(R.id.english)
        val radio_group=findViewById<RadioGroup>(R.id.radio_grp1)
        radio_group.setOnCheckedChangeListener{_,isChecked ->
            if(isChecked==R.id.english){
                Toast.makeText(this,"you click english",Toast.LENGTH_LONG).show()
            }
            else if(isChecked==R.id.hindi){
                Toast.makeText(this,"you click hindi",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"you click not",Toast.LENGTH_LONG).show()
            }
        }



        val check=findViewById<CheckBox>(R.id.checkbox_1)

        check.setOnCheckedChangeListener{_,isChecked->
            if(isChecked){
                Toast.makeText(this,"you click it",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"you not click",Toast.LENGTH_LONG).show()
            }
        }



    }
}