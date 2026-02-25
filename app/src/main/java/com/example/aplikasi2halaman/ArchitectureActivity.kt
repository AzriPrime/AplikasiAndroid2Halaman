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
        val textDeviceDetail = findViewById<TextView>(R.id.text_device_detail)

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

        val textInfo =  "Model      \n" +
                        "Manufaktur \n" +
                        "Brand      \n" +
                        "Baterai    \n" +
                        "User       \n" +
                        "Type       \n"+
                        "Host       "

        val textDetail =":  $model\n" +
                        ":  $manufaktur\n" +
                        ":  $brand\n" +
                        ":  $getBatteryPercentage%\n" +
                        ":  $user\n" +
                        ":  $type\n" +
                        ":  $host"

        textDeviceInfo.text = textInfo
        textDeviceDetail.text = textDetail
    }
}