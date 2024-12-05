package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlertDialog1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.alert_dialog1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn = findViewById<Button>(R.id.btnalert)
        btn.setOnClickListener {


            showAlert();
        }
    }
//    one is click outside the box is disappper that need not tobe happen
//    cancelable
    private fun showAlert(){
        val builder= AlertDialog.Builder(this)
        builder.setTitle("Alert Bar")
        builder.setMessage("This is a alert box")

        builder.setPositiveButton("OK"){dialog,_->

            dialog.dismiss()
        }
        builder.setCancelable(false)

        builder.setNegativeButton("Cancel"){dialog,_->
            dialog.dismiss()
        }
        val alertDialog=builder.create()
        alertDialog.show()
//        alertDialog.window?.setBackgroundDrawableResource(R.color.teal_200)
    alertDialog.findViewById<TextView>(R.id.alert)?.setTextColor(R.color.purple_200)

    }
}