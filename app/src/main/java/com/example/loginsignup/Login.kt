package com.example.loginsignup

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        //supportActionBar?.title = "Activity 2"
        //supportActionBar?.title = "Activity 1"
        //supportActionBar?.title = "Activity 1"
        //supportActionBar?.title = "Activity 2"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }


    fun openMain3(view: View) {
        val intent = Intent(this, Homescreen::class.java)
        startActivity(intent)
    }

    fun openMain(view: View) {
        val intent = Intent(this, ForgotPassActivity::class.java)
        startActivity(intent)
    }

    fun openMain5(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}