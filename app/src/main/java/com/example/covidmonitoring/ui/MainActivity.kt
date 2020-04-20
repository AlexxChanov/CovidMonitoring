package com.example.covidmonitoring.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.covidmonitoring.R

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.navHost,NavFragment())
            .commit()

    }
}