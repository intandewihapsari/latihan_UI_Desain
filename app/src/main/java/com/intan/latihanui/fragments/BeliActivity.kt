package com.intan.latihanui.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.intan.latihanui.R


class BeliActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beli)
        val oke = findViewById<Button>(R.id.ok)

        oke.setOnClickListener {
            startActivity(Intent(this, BayarActivity::class.java))
        }
    }
}