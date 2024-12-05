package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PopPopMenu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pop_pop_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn=findViewById<Button>(R.id.pop1)
        btn.setOnClickListener{
            view->showPopupMenu(view)

        }
    }
    private fun showPopupMenu(view: View){
        val popupmenu=PopupMenu(this,view)
        popupmenu.menuInflater.inflate(R.menu.menu4,popupmenu.menu)
        val text1=findViewById<TextView>(R.id.poptext)
        val edit=findViewById<EditText>(R.id.popedit)
        val submit=findViewById<Button>(R.id.popsubmit)

        popupmenu.setOnMenuItemClickListener { menuItem:MenuItem->
            when(menuItem.itemId){
                R.id.popitem->{
//                    Toast.makeText(this,"hi ",Toast.LENGTH_LONG).show()
//                    val t=edit.text.toString()
//                    edit.text=text1.text
                    submit.setOnClickListener{

                    }
                    true
                }
                R.id.sharepop->{
                    text1.text="Hi hello how are you"







                    true
                }
                else-> {


                    Toast.makeText(this, "pop ", Toast.LENGTH_LONG).show()
                    true
                }

            }



        }
        popupmenu.show()

    }
}