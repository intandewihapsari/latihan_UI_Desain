package com.intan.latihanui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val masuk = findViewById<Button>(R.id.btn_masuk)
        val back = findViewById<ImageView>(R.id.back)

        masuk.setOnClickListener{
            startActivity(Intent(this,BerandaActivity::class.java))
        }
        back.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}