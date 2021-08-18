package com.intan.latihanui.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.intan.latihanui.BerandaActivity
import com.intan.latihanui.R

class BayarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bayar)
        val selesai = findViewById<Button>(R.id.selesai)

        selesai.setOnClickListener {
            startActivity(Intent(this, BerandaActivity::class.java))
        }
    }
}