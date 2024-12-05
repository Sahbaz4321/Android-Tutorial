




package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class search_bar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.search_bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText=findViewById<EditText>(R.id.users)
        val radiogrp=findViewById<RadioGroup>(R.id.radiogrp)
       radiogrp.setOnCheckedChangeListener{_ ,isChecked -> if(isChecked ==R.id.plying){
           Toast.makeText(this,"you clicked playing button",Toast.LENGTH_LONG).show()




       }
           else if(isChecked ==R.id.sleeping){
           Toast.makeText(this,"you clicked sleeping button",Toast.LENGTH_LONG).show()

       }

       else if(isChecked ==R.id.travel){
           Toast.makeText(this,"you clicked travelling button",Toast.LENGTH_LONG).show()

       }
       else if(isChecked ==R.id.reading){
           Toast.makeText(this,"you clicked reading button",Toast.LENGTH_LONG).show()

       }

       }

        val checkbox1=findViewById<CheckBox>(R.id.agra)
        val checkbox2=findViewById<CheckBox>(R.id.aligarh)
        val checkbox3=findViewById<CheckBox>(R.id.kashmir)
        val checkbox4=findViewById<CheckBox>(R.id.noida)

        checkbox1.setOnCheckedChangeListener{_,isChecked -> if(isChecked){

            Toast.makeText(this,"you clicked Agra city",Toast.LENGTH_LONG).show()

        }


        }



        checkbox2.setOnCheckedChangeListener{_,isChecked -> if(isChecked){

            Toast.makeText(this,"you clicked Aligarh city",Toast.LENGTH_LONG).show()

        }


        }


        checkbox3.setOnCheckedChangeListener{_,isChecked -> if(isChecked){

            Toast.makeText(this,"you clicked jammu and kashmir city",Toast.LENGTH_LONG).show()

        }


        }


        checkbox4.setOnCheckedChangeListener{_,isChecked -> if(isChecked){

            Toast.makeText(this,"you clicked Noida city",Toast.LENGTH_LONG).show()

        }


        }

        val spinner_item=findViewById<Spinner>(R.id.spinner)
        val item_arr=arrayOf("india","japan","america","tokia")
        val array_adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,item_arr)
        array_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinner_item.adapter=array_adapter
        spinner_item.adapter=array_adapter

        spinner_item.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selected_item=parent?.getItemAtPosition(position).toString()
       Toast.makeText(parent?.context,"$selected_item",Toast.LENGTH_LONG).show();
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }





    }
}