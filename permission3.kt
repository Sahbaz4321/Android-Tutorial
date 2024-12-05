//package com.example.myapplication
//
//import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import androidx.core.content.ContextCompat
//import android.content.pm.PackageManager
//import android.widget.Toast
//import androidx.compose.material3.TopAppBar
//import androidx.core.app.ActivityCompat
//
//class permission3 : AppCompatActivity() {
//    val permission= arrayOf(android.Manifest.permission.CAMERA,android.Manifest.permission.ACCESS_FINE_LOCATION)
//    val REQUEST_CODE=123
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_permission3)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//        if(!hasPermission(permission)){
//            ActivityCompat.requestPermissions(this,permission,REQUEST_CODE)
//        }
//        else{
//            Toast.makeText(this,"denied",Toast.LENGTH_LONG).show()
//        }
//    }
//    private override fun hasPermission(){
//
//    }
//}