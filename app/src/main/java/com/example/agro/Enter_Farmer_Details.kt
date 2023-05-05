package com.example.agro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.agro.models.EmployeeModel
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Enter_Farmer_Details : AppCompatActivity() {

    private lateinit var etCultivatedLocation: EditText
    private lateinit var etCultivatedCrop: EditText
    private lateinit var etCultivatedArea: EditText
    private lateinit var btnSubmit: ImageView

    private lateinit var dbRef : DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_farmer_details)

        etCultivatedLocation = findViewById(R.id.enterCultivatedLocation)
        etCultivatedCrop = findViewById(R.id.enterCultivatedCrop)
        etCultivatedArea = findViewById(R.id.enterCultivationArea)
        btnSubmit = findViewById(R.id.imageButton2)

        dbRef = FirebaseDatabase.getInstance().getReference("CultivatedArea")

        btnSubmit.setOnClickListener {
            saveCultivatedData()

            val AddFarmerDetails = findViewById<ImageView>(R.id.imageButton2)
            AddFarmerDetails.setOnClickListener {
                val Intent = Intent(this,Farmer_All_Details::class.java)
                startActivity(Intent)
            }

        }


    }
    private fun saveCultivatedData(){

        //getting values
        val cultivatedLocation = etCultivatedLocation.text.toString()
        val cultivatedCrop = etCultivatedCrop.text.toString()
        val cultivatedArea = etCultivatedArea.text.toString()

        if (cultivatedLocation.isEmpty()){
            etCultivatedLocation.error = "Please enter Employee Name"
        }
        if (cultivatedCrop.isEmpty()){
            etCultivatedCrop.error = "Please enter Employee Age"
        }
        if (cultivatedArea.isEmpty()){
            etCultivatedArea.error = "Please enter Employee Salary"
        }

        val cultivatedId = dbRef.push().key!!


        val employee = EmployeeModel(cultivatedId, cultivatedLocation, cultivatedCrop, cultivatedArea)

        dbRef.child(cultivatedId).setValue(employee)
            .addOnCompleteListener{
                Toast.makeText(this,"Data Insert Successfully", Toast.LENGTH_LONG).show()
            }.addOnFailureListener{ err ->
                Toast.makeText(this,"Error ${err.message}", Toast.LENGTH_LONG).show()
            }




    }
}