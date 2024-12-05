package com.example.myapplication

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Permission6 : AppCompatActivity() {
    val permission = arrayOf(
        android.Manifest.permission.ACCESS_FINE_LOCATION,
        android.Manifest.permission.CAMERA,
        android.Manifest.permission.READ_EXTERNAL_STORAGE,
        android.Manifest.permission.READ_PHONE_NUMBERS
    )
    val code = 123
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.permission6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        if (!haspermission(permission)) {
            ActivityCompat.requestPermissions(this, permission, code)
        }
    }

    fun haspermission(permission: Array<String>): Boolean {
        return permission.all { permission ->
            ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED
        }
    }

    override fun onRequestPermissionsResult(
        code: Int,
        permission: Array<out String>,
        result: IntArray
    ) {
        super.onRequestPermissionsResult(code, permission, result)
        if (code == code) {


            val denied = mutableListOf<String>()
            for (i in permission.indices) {
                if (result[i] != PackageManager.PERMISSION_GRANTED) {
                    denied.add(permission[i])
                }
            }
            if (denied.isEmpty()) {

            }
        }
    }
}