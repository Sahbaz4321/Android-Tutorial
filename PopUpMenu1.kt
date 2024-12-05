package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuItemImpl
import androidx.appcompat.widget.PopupMenu
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class PopUpMenu1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pop_up_menu1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn=findViewById<Button>(R.id.popup_btn)
        btn.setOnClickListener{

            view->showPopUp(view)
        }
    }
    @SuppressLint("ResourceAsColor")
    private  fun showPopUp(view: View){
        val popupmenu= PopupMenu(this,view)
        menuInflater.inflate(R.menu.combinemenu,popupmenu.menu)

        popupmenu.setOnMenuItemClickListener{
            menuItem: MenuItem ->
                when(menuItem.itemId){
                    R.id.colorchange->{
                        val text1=findViewById<TextView>(R.id.popup_text)
                        text1.setTextColor(R.color.teal_700)
                        text1.setBackgroundColor(R.color.purple_200)
                        true

                    }
                    else->{

                        true


                    }


        }

        }

popupmenu.show()
    }
}