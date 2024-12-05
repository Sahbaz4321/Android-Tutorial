package com.example.myapplication

import android.annotation.SuppressLint
import android.view.ContextMenu
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ContextMenu2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.context_menu2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val image1=findViewById<ImageView>(R.id.image2)
        registerForContextMenu(image1)

    }
    override fun onCreateContextMenu(menu:ContextMenu?, v: View?,menuInfo:ContextMenu.ContextMenuInfo?){
        super.onCreateContextMenu(menu,v,menuInfo)
        menuInflater.inflate(R.menu.combinemenu,menu)


    }


    override fun onContextItemSelected(item:MenuItem):Boolean{
        return when(item.itemId){
            R.id.colorchange->{
                val image1=findViewById<ImageView>(R.id.image2)
                image1.setBackgroundColor(R.color.purple_500)
                true
            }
            else->{
                true

            }
        }
    }
}