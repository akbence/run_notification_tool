package com.example.bence.runnotificationtool

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getUserLocation(view: View){
        val toastUpdated= Toast.makeText(this,"Updated",Toast.LENGTH_SHORT)
        showUserLocation()
        toastUpdated.show()
    }

    private fun showUserLocation(){

        val showLocationTextView = findViewById(R.id.showLocation) as TextView
        showLocationTextView.text = "not implemented"
    }
}
