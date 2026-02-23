package com.example.aplikasi2halaman

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class ArchitectureActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_architecture)

        val btnBack = findViewById<Button>(R.id.btn_back)

        btnBack.setOnClickListener {
            finish()
        }
    }
}