package com.example.buttonclicktheme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dark = findViewById<Button>(R.id.btn_dark)

        val light = findViewById<Button>(R.id.btn_light)

        val layout = findViewById<ConstraintLayout>(R.id.constraint)


        light.setOnClickListener {
            layout.setBackgroundResource(R.color.teal_200)
        }

        dark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }

    }
}