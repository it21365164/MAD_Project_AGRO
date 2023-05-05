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

class Add_Iteam : AppCompatActivity() {

    private lateinit var etCropName: EditText
    private lateinit var etCropWeight: EditText
    private lateinit var etCropLocation: EditText
    private lateinit var btnSubmit: ImageView

    private lateinit var dbRef : DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_iteam)

        etCropName = findViewById(R.id.editTextTextPersonName3)
        etCropWeight = findViewById(R.id.editTextNumber2)
        etCropLocation = findViewById(R.id.editTextTextPersonName2)
        btnSubmit = findViewById(R.id.imageButton)

        dbRef = FirebaseDatabase.getInstance().getReference("Crops")

        btnSubmit.setOnClickListener {
            saveCropData()

            val AddNewIteam = findViewById<ImageView>(R.id.imageButton)
            AddNewIteam.setOnClickListener {
                val Intent = Intent(this, Add_iteam_view::class.java)
                startActivity(Intent)
            }
        }


        }
    private fun saveCropData(){

        //getting values
        val cropName = etCropName.text.toString()
        val cropWeight = etCropWeight.text.toString()
        val cropLocation = etCropLocation.text.toString()

        if (cropName.isEmpty()){
            etCropName.error = "Please enter Employee Name"
        }
        if (cropWeight.isEmpty()){
            etCropWeight.error = "Please enter Employee Age"
        }
        if (cropLocation.isEmpty()){
            etCropLocation.error = "Please enter Employee Salary"
        }

        val cropId = dbRef.push().key!!


        val employee = EmployeeModel(cropId, cropName, cropWeight, cropLocation)

        dbRef.child(cropId).setValue(employee)
            .addOnCompleteListener{
                Toast.makeText(this,"Data Insert Successfully", Toast.LENGTH_LONG).show()
            }.addOnFailureListener{ err ->
                Toast.makeText(this,"Error ${err.message}", Toast.LENGTH_LONG).show()
            }



    }

}


