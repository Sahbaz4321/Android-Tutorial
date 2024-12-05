package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlertDialog2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.alert_dialog2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn=findViewById<Button>(R.id.alert_bar)
        btn.setOnClickListener{
            showAlert()
        }
    }
    fun showAlert(){
        val builder= AlertDialog.Builder(this)
        builder.setTitle("Alert")
        builder.setMessage("hi i am alert")
        builder.setPositiveButton("OK"){dialog,_->
            dialog.dismiss()
        }
        builder.setNegativeButton("CANCEL"){dialog,_->
            dialog.dismiss()
        }
        builder.setNeutralButton("*"){dialog,_->
            dialog.dismiss()
        }
        builder.setCancelable(false)
        val alert=builder.create()
        alert.show()
        alert.window?.setBackgroundDrawableResource(R.color.teal_200)


    }
}