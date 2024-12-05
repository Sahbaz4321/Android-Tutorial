//package com.example.optionmenu
//
//import android.content.Intent
//import android.os.Bundle
//import android.view.View
//import android.widget.EditText
//import android.widget.Toast
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.appcompat.widget.PopupMenu
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import com.example.optionmenu.databinding.ActivityMainBinding
//
//class AppChosserClass : AppCompatActivity() {
//    private lateinit var binding : ActivityMainBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        enableEdgeToEdge()
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//
//        binding.button.setOnClickListener{ view->
//            showPopUpMenu(view)
//        }
//
//    }
//    private fun showPopUpMenu (view: View){
//        val popupMenu = PopupMenu(this,view)
//        popupMenu.menuInflater.inflate(R.menu.menu_bar,popupMenu.menu)
//        popupMenu.show()
//
//        popupMenu.setOnMenuItemClickListener { menuItem ->
//            when (menuItem.itemId) {
//                R.id.copy -> {
//                    val editText = findViewById<EditText>(R.id.edtex)
//                    val textToCopy = editText.text.toString()
//                    val clipboardManager = getSystemService(CLIPBOARD_SERVICE) as android.content.ClipboardManager
//                    val clipData = android.content.ClipData.newPlainText("text", textToCopy)
//                    clipboardManager.setPrimaryClip(clipData)
//                    Toast.makeText(this, "Copied", Toast.LENGTH_SHORT).show()
//                }
//                R.id.delete ->{
//                    val editText = findViewById<EditText>(R.id.edtex)
//                    editText.text.clear()
//                    Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show()
//                }
//
//                R.id.share -> {
//                    val text = binding.edtex.text.toString()
//                    val intent = Intent(Intent.ACTION_SEND)
//                    intent.type = "text/plain"
//                    intent.putExtra(Intent.EXTRA_TEXT,text)
//                    startActivity(Intent.createChooser(intent,"Share using"))
//                }
//            }
//            true
//        }
//
//    }
//}