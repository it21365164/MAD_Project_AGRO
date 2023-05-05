package com.example.agro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class login : AppCompatActivity() {

    private lateinit var LoginPGBtnFarmer : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val firebase : DatabaseReference = FirebaseDatabase.getInstance().getReference()

        LoginPGBtnFarmer = findViewById(R.id.loginBtnLoginPg)

        LoginPGBtnFarmer.setOnClickListener {
            val intent = Intent(this, As_a_Farmer::class.java)
            startActivity(intent)
        }
//
//        //login as a farmer
//        val LoginPGBtnFarmer = findViewById<Button>(R.id.loginBtnLoginPg)
//        LoginPGBtnFarmer.setOnClickListener {
//            val Intent = Intent(this,As_a_Farmer::class.java)
//            startActivity(Intent)
//        }

//        //login as a buyer
//        val LoginPGBtnBuyer = findViewById<Button>(R.id.loginBtnLoginPg)
//        LoginPGBtnBuyer.setOnClickListener {
//            val Intent = Intent(this,As_a_Farmer::class.java)/////////////changelink
//            startActivity(Intent)
//        }
//        //login as a fretilizer
//        val LoginPGBtnFretilizer = findViewById<Button>(R.id.loginBtnLoginPg)
//        LoginPGBtnFretilizer.setOnClickListener {
//            val Intent = Intent(this,As_a_Farmer::class.java)/////////////changelink
//            startActivity(Intent)
//        }
//        //login as a seed distributor
//        val LoginPGBtnDristributor = findViewById<Button>(R.id.loginBtnLoginPg)
//        LoginPGBtnDristributor.setOnClickListener {
//            val Intent = Intent(this,As_a_Farmer::class.java)////////////changelink
//            startActivity(Intent)
//        }
    }
}