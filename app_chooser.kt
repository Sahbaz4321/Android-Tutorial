package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class app_chooser : AppCompatActivity() {
    val arr = arrayOf("789654323", "4356785", "1234567")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.app_chooser)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val list = findViewById<ListView>(R.id.recent_call)
        val array_adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)

        list.adapter = array_adapter

        list.setOnItemClickListener { parent, view, position, id ->
            val selected_item = arr[position]
            Toast.makeText(this, "$selected_item", Toast.LENGTH_LONG).show()
        }
        registerForContextMenu(list)


    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu2, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val menuInfo = item.menuInfo as AdapterView.AdapterContextMenuInfo
        val selectedItemPosition = menuInfo.position

        val selectedPhoneNumber =
            (findViewById<ListView>(R.id.recent_call).adapter as ArrayAdapter<String>).getItem(
                selectedItemPosition
            )


        return when (item.itemId) {
            R.id.send_msg -> {
//                Toast.makeText(this,"hi",Toast.LENGTH_LONG).show
                val intent = Intent(Intent.ACTION_SENDTO)


                val text = "hi hello"
                val ele=arr[selectedItemPosition]
                intent.data = Uri.parse("sms:$ele")
                intent.putExtra("sms_body", text)
                startActivity(intent)






                true
            }

            else -> {
                true
            }
        }
    }
}