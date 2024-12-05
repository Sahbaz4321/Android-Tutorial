package com.example.myapplication

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PopUp3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pop_up3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn=findViewById<Button>(R.id.popup_btn1)
        btn.setOnClickListener{
            view->showpopup(view)
        }

    }
    private fun showpopup(view: View){
        val popup= PopupMenu(this,view)
       popup.menuInflater.inflate(R.menu.combinemenu,popup.menu)
        popup.setOnMenuItemClickListener{menuItem: MenuItem->
         when(menuItem.itemId){
            R.id.colorchange->{
                val btn=findViewById<Button>(R.id.popup_btn1)
                btn.setTextColor(R.color.purple_200)
                btn.setBackgroundColor(R.color.teal_700)
                true
            }
            else->{
              true

            }

        }
        }
        popup.show()

    }
}