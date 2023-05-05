package com.example.agro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.agro.models.EmployeeModel
import com.google.firebase.database.FirebaseDatabase

class Farmer_All_Details : AppCompatActivity() {

    private lateinit var tvEmpId: TextView
    private lateinit var tvEmpName: TextView
    private lateinit var tvEmpEmail: TextView
    private lateinit var tvEmpTel: EditText
    private lateinit var tvEmpAddress: EditText

    private lateinit var btnUpdate: Button
    private lateinit var btnDelete: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_farmer_all_details)

        val UpdateFarmerDetails = findViewById<Button>(R.id.button)
        UpdateFarmerDetails.setOnClickListener {
            val Intent = Intent(this,Update_User_Profile::class.java)
            startActivity(Intent)
        }



    }
}