package com.example.aplikasi2halaman

import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // findViewById adalah metode bawaan framework android.view.View
        val btnNextPage = findViewById<Button>(R.id.btn_next_page)

        // Intent adalah kelas framework inti (android.content.Intent)
        btnNextPage.setOnClickListener {
            val intent = Intent(this, ArchitectureActivity::class.java)
            startActivity(intent)
        }
    }
}