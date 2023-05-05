package com.example.agro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Add_iteam_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_iteam_view)

        val UpdateIteam1 = findViewById<Button>(R.id.button3)
        UpdateIteam1.setOnClickListener {
            val Intent = Intent(this,Update_Items_popUp::class.java)
            startActivity(Intent)
        }

        val UpdateIteam2 = findViewById<Button>(R.id.button5)
        UpdateIteam2.setOnClickListener {
            val Intent = Intent(this,Update_Items_popUp::class.java)
            startActivity(Intent)
        }

    }
}