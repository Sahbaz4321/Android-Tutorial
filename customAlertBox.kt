package com.example.myapplication

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class customAlertBox : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.custom_alertbox)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showAlert()
    }
    @SuppressLint("MissingInflatedId")
    fun showAlert(){
        val dialogView= LayoutInflater.from(this).inflate(R.layout.customlayout,null)
        val text=dialogView.findViewById<TextView>(R.id.custom_alert_title)
        val msg=dialogView.findViewById<TextView>(R.id.custom_alert_msg)
        val ok=dialogView.findViewById<Button>(R.id.ok_btn)
        val cancel=dialogView.findViewById<Button>(R.id.cancel_btn_custome)

        val dialog= AlertDialog.Builder(this).setView(dialogView).setCancelable(false).create()
        ok.setOnClickListener{
            val layout=findViewById<LinearLayout>(R.id.main_layout)
//            layout.setBackgroundColor(R.color.pink)
            layout.setBackgroundColor(ContextCompat.getColor(this, R.color.darkPink))

//            finish()

        }
        cancel.setOnClickListener{
            finish()
        }

        dialog.show()

    }
}