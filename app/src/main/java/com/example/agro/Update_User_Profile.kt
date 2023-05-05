package com.example.agro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Update_User_Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_user_profile)

        val UpdateFarmerDetails2 = findViewById<Button>(R.id.Button7)
        UpdateFarmerDetails2.setOnClickListener {
            val Intent = Intent(this,Farmer_All_Details::class.java)
            startActivity(Intent)
        }
    }
}