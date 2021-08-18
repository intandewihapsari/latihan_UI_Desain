package com.intan.latihanui.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.intan.latihanui.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val beli = findViewById<Button>(R.id.beli)

        beli.setOnClickListener{
            startActivity(Intent(this, BeliActivity::class.java))
        }
    }
}