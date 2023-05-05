package com.example.agro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.agro.models.EmployeeModel
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Register : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etAddress: EditText
    private lateinit var etTel: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPassward: EditText
    private lateinit var btnRegister: Button

    private lateinit var dbRef : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)



        etName = findViewById(R.id.enterName)
        etAddress = findViewById(R.id.enterAddress)
        etTel = findViewById(R.id.enterTel)
        etEmail = findViewById(R.id.enterEmail)
        etPassward = findViewById(R.id.enterPassword)
        btnRegister = findViewById(R.id.register3btn)

        dbRef = FirebaseDatabase.getInstance().getReference("Farmer_Details")

        btnRegister.setOnClickListener {
            saveCropData()

            //farmer
            val RegisterBtn = findViewById<Button>(R.id.register3btn)
            RegisterBtn.setOnClickListener {
                val Intent = Intent(this,MainActivity::class.java)
                startActivity(Intent)
            }
        }


    }
    private fun saveCropData(){

        //getting values
        val name = etName.text.toString()
        val address = etAddress.text.toString()
        val tel = etTel.text.toString()
        val eMail = etEmail.text.toString()
        val passward = etPassward.text.toString()

        if (name.isEmpty()){
            etName.error = "Please enter Employee Name"
        }
        if (address.isEmpty()){
            etAddress.error = "Please enter Employee Address"
        }
        if (tel.isEmpty()){
            etTel.error = "Please enter Employee Telephone number"
        }
        if (eMail.isEmpty()){
            etEmail.error = "Please enter Employee Email"
        }
        if (passward.isEmpty()){
            etPassward.error = "Please enter passward"
        }

        val empId = dbRef.push().key!!


        val employee = EmployeeModel(empId, name, address, tel,eMail,passward)

        dbRef.child(empId).setValue(employee)
            .addOnCompleteListener{
                Toast.makeText(this,"Data Insert Successfully", Toast.LENGTH_LONG).show()
            }.addOnFailureListener{ err ->
                Toast.makeText(this,"Error ${err.message}", Toast.LENGTH_LONG).show()
            }



    }


}