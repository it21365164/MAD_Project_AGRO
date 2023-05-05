package com.example.agro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firebase : DatabaseReference = FirebaseDatabase.getInstance().getReference()




        val Register1Btn = findViewById<Button>(R.id.register1Btn)
        Register1Btn.setOnClickListener {
            val Intent = Intent(this,RegisterSection::class.java)
            startActivity(Intent)
        }

        val LoginBtn = findViewById<Button>(R.id.loginbtn)
        LoginBtn.setOnClickListener {
            val Intent = Intent(this,login::class.java)
            startActivity(Intent)
        }

    }

}