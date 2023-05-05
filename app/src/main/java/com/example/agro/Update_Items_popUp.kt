package com.example.agro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Update_Items_popUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_items_pop_up)

        val UpdateIteam1 = findViewById<Button>(R.id.button8)
        UpdateIteam1.setOnClickListener {
            val Intent = Intent(this,Add_iteam_view::class.java)
            startActivity(Intent)
        }
    }
}