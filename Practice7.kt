package com.example.myapplication

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class Practice7 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.practice7)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        listview language half part \\ right side me jo text hoga wo convert hoga
val list=findViewById<ListView>(R.id.text_lang)
        val arr= arrayOf("hi","en")
        val btn=findViewById<Button>(R.id.change_lang)
        val text1=findViewById<TextView>(R.id.text_languge)
        val edit=findViewById<EditText>(R.id.edit_lang)
        val ada= ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
      var selected_item=arr[0]
        list.adapter=ada
        list.setOnItemClickListener{
                parent,view,position,id ->
            selected_item=arr[position]
            Toast.makeText(this,"$selected_item", Toast.LENGTH_LONG).show()
        }
        btn.setOnClickListener{
            setLocale(selected_item)
        }


    }
    fun setLocale(s:String){
        val current= Locale.getDefault().language
        if(s!=current){
            val locale= Locale(s)
            Locale.setDefault(locale)
            val config= Configuration(resources.configuration)
            config.setLocale(locale)
            resources.updateConfiguration(config,resources.displayMetrics)
            recreate()

        }

    }
}