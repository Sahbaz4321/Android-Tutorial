package com.example.myapplication

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.widget.Button

class Permission4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.permission4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val s1 = findViewById<Button>(R.id.send1)
        s1.setOnClickListener {
            shareText("this text is being shared")
        }
//        if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)!=PackageManager.PERMISSION_GRANTED){
//            requestPermissionsSlef();
//        }
//        else{
//
//        }
    }
    private fun shareText(msg: String) {
        var send: Intent =Intent().apply {
            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,msg)
            type="text/plain"
        }
        var i: Intent= Intent.createChooser(send,"share via")
        startActivity(i)
    }
}
//    fun requestPermissionsSlef(){
//        val request=registerForActivityResult(ActivityResultContracts.RequestPermission()){isGranter :Boolean ->
//        if(isGranter){
//            accessLocation()
//
//        }
//            else{
//                Toast.makeText(this,"hi hello",Toast.LENGTH_LONG).show()
//        }
//        }
//        request.launch(Manifest.permission.ACCESS_FINE_LOCATION)
//    }
//    fun accessLocation(){
//
//    }
