package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Custome12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custome12)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showAlert()
    }

    @SuppressLint("MissingInflatedId")
    fun showAlert(){
        val dialogView=LayoutInflater.from(this).inflate(R.layout.custome_alert_box,null)
        val btn=dialogView.findViewById<Button>(R.id.custom_ok)
        val cancel=dialogView.findViewById<Button>(R.id.custom_cancel)
        val dialog= AlertDialog.Builder(this).setView(dialogView).setCancelable(false).create()

        btn.setOnClickListener {
//            val color = ContextCompat.getColor(this, R.color.teal_200)
            val text1=findViewById<TextView>(R.id.text12)
            text1.text="you are home page"

            dialog.dismiss()
        }
        cancel.setOnClickListener{
            finish()

        }

        dialog.show()
    }
}