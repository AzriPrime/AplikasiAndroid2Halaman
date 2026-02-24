package com.example.aplikasi2halaman

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.os.Build
import android.os.BatteryManager
import android.widget.TextView

class ArchitectureActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_architecture)

        val btnBack = findViewById<Button>(R.id.btn_back)
        val textDeviceInfo = findViewById<TextView>(R.id.text_device_info)

        btnBack.setOnClickListener {
            finish()
        }

        val model = Build.MODEL
        val manufaktur = Build.MANUFACTURER
        val brand = Build.BRAND
        val user = Build.USER
        val type = Build.TYPE
        val host = Build.HOST

        val batteryManager = getSystemService(Context.BATTERY_SERVICE) as BatteryManager
        val getBatteryPercentage = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY)

        val textInfo =  "Model          : $model\n" +
                        "Manufaktur     : $manufaktur\n" +
                        "Brand          : $brand\n" +
                        "Baterai        : $getBatteryPercentage%\n" +
                        "User           : $user \n" +
                        "Type           : $type\n" +
                        "Host           : $host \n"

        textDeviceInfo.text = textInfo
    }
}