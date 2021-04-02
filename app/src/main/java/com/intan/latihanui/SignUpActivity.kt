package com.intan.latihanui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val selesai = findViewById<Button>(R.id.btn_selesai)
        val back = findViewById<ImageView>(R.id.back)

        selesai.setOnClickListener {
            startActivity(Intent(this, BerandaActivity::class.java))
        }
        back.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}