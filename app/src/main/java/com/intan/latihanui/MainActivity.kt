package com.intan.latihanui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mBtnLogin = findViewById<Button>(R.id.btn_login)
        val buatAkun = findViewById<TextView>(R.id.buatAkun)

        buatAkun.setOnClickListener{
            startActivity(Intent(this,SignUpActivity::class.java))
        }
        mBtnLogin.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}