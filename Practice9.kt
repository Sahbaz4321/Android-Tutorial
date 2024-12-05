package com.example.myapplication

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Practice9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.practice9)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_theme)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onCreateOptionsMenu(menu: Menu):Boolean{
        menuInflater.inflate(R.menu.exammenu,menu)

        return true



    }
    override fun onOptionsItemSelected(item: MenuItem):Boolean{
        val id=findViewById<LinearLayout>(R.id.main_theme)

        return when(item.itemId){
            R.id.black->{

               id.setBackgroundColor(R.color.black)
                true

            }
            R.id.white->{

                id.setBackgroundColor(R.color.white)
                true

            }

            else->{
                true

            }
        }

    }
}