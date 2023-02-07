package com.example.switchdemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ftSwitch = findViewById<Switch>(R.id.switch1)
        val cmptSwitch = findViewById<SwitchCompat>(R.id.switch2)
        val Result = findViewById<TextView>(R.id.tvResult)
        val imglight = findViewById<ImageView>(R.id.imgBalb)

        ftSwitch.setOnCheckedChangeListener { buttonView: CompoundButton, isChecked:Boolean ->
            if (isChecked) {
                Result.setText("Wifi On")
            } else {
                Result.setText("Wifi Off")
            }
        }

        cmptSwitch.setOnCheckedChangeListener { buttonView: CompoundButton, isChecked:Boolean ->
            if (isChecked){
                imglight.setImageResource(R.drawable.balbon)
            } else {
                imglight.setImageResource(R.drawable.balboff)
            }
        }

    }
}