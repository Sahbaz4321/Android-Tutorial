package com.example.myapplication

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActionBar2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.action_bar2)


    }


    override   fun onCreateOptionsMenu(menu: Menu?):Boolean{
        menuInflater.inflate(R.menu.menu1,menu)
        return true
    }

  override fun onOptionsItemSelected(item: MenuItem):Boolean{


      return when(item.itemId){
          R.id.search->{
              Toast.makeText(this,"you clicked search icon", Toast.LENGTH_LONG).show()
              true
          }


          else->{
              Toast.makeText(this,"default",Toast.LENGTH_LONG).show()
              true
          }
      }
  }
}