package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.tooling.animation.ToolingState
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class spinner_tutorial : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.spinner_tutorial)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val spinner_data=findViewById<Spinner>(R.id.spin)
        val arr=arrayOf("BMW","MERCIDES","SUZUKI");

        val array_adapter= ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr)
        array_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_data.adapter=array_adapter

        spinner_data.onItemSelectedListener=object: AdapterView.OnItemSelectedListener
        {

        override fun onItemSelected (parent:AdapterView<*>?, view: View?, position:Int, id:Long){
            val selected_item=parent?.getItemAtPosition(position).toString()
            Toast.makeText(parent?.context,"$selected_item item",Toast.LENGTH_LONG).show()


        }
            override fun onNothingSelected(parent:AdapterView<*>?){

            }

        }
    }
}