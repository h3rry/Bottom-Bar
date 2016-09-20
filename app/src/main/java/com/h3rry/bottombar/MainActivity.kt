package com.h3rry.bottombar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        bottomBar.setOnTabSelectListener { tabId ->
            when (tabId) {
                R.id.tab_favorites -> {
                    Log.i("kotlin123", "tab_favorites")
                }
                R.id.tab_car_wash -> {
                    Log.i("kotlin123", "tab_car_wash")
                }
                R.id.tab_schedule -> {
                    Log.i("kotlin123", "tab_schedule")
                }
                R.id.tab_whatshot -> {
                    Log.i("kotlin123", "tab_whatshot")
                }
                R.id.tab_tag -> {
                    Log.i("kotlin123", "tab_tag")
                }
            }
        }
    }

}

