package com.example.myapplicationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var permissin : AppPermissions

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        permissin = AppPermissions()

        if (permissin.isLocationOk(this)){
            println("Allowed")
        }else{
            permissin.requestLocationPermission(this)
            println("denied")
        }
    }
}