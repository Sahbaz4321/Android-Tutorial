package com.example.myapplication

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainLoginPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_login_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn=findViewById<Button>(R.id.change_lang)
        val reset=findViewById<Button>(R.id.resetLang)



        btn.setOnClickListener{
            setLocale("hi")
        }

        reset.setOnClickListener{
            setLocale("en")
        }


    }
    fun setLocale(s:String){
        val current= Locale.getDefault().language
        if(s!=current){
            val locale=Locale(s)
            Locale.setDefault(locale)
            val c=Configuration(resources.configuration)
            c.setLocale(locale)
            resources.updateConfiguration(c,resources.displayMetrics)
            recreate()
        }
    }
}
