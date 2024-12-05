//package com.example.myapplication
//
//import android.annotation.SuppressLint
//import android.content.res.Configuration
//import android.os.Build
//import android.os.Bundle
//import android.widget.Button
//import android.widget.TextView
//import androidx.activity.enableEdgeToEdge
//import androidx.annotation.RequiresApi
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import androidx.lifecycle.findViewTreeViewModelStoreOwner
//import org.w3c.dom.Text
//import java.util.Locale
//
//
//class EnglishToHindi : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.english_to_hindi)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//
//    val btn=findViewById<Button>(R.id.change)
//        btn.setOnClickListener{
//            setLocale("ja")
//        }
//        }
//
//    fun setLocale(s:String){
//        val current=Locale.getDefault().language
////        val current="en"
//        if(s!=current) {
//            val locale = Locale(s)
//            Locale.setDefault(locale)
//            val c = Configuration(resources.configuration)
//            c.setLocale(locale)
//            resources.updateConfiguration(c, resources.displayMetrics)
//
//            recreate()
//        }
//    }
//
//}