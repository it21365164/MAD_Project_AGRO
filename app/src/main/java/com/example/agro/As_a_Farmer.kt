package com.example.agro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class As_a_Farmer : AppCompatActivity() {

    private  lateinit var btnInsertFarmerDetails : ImageView
    private lateinit var btnOrderFertilize : ImageView
    private  lateinit var btnAddIteam : ImageView
    private lateinit var btnOrderSeeds : ImageView
    private  lateinit var btnFarmerDetails : ImageView
    private lateinit var btnOrderDetails : ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_as_afarmer)

        val firebase : DatabaseReference = FirebaseDatabase.getInstance().getReference()

        btnInsertFarmerDetails = findViewById(R.id.farmerdetailsimg)
        btnOrderFertilize = findViewById(R.id.orderfrtilizerimg)
        btnAddIteam = findViewById(R.id.sellimg)
        btnOrderSeeds = findViewById(R.id.orderseedimg)
        btnFarmerDetails = findViewById(R.id.imageButton6)
        btnOrderDetails = findViewById(R.id.imageButton7)


        btnInsertFarmerDetails.setOnClickListener {
            val intent = Intent(this, Enter_Farmer_Details::class.java)
            startActivity(intent)
        }
        btnOrderFertilize.setOnClickListener {
            val intent = Intent(this, Fretilize_Order::class.java)
            startActivity(intent)

        }
        btnAddIteam.setOnClickListener {
            val intent = Intent(this, Add_Iteam::class.java)
            startActivity(intent)

        }
        btnOrderSeeds.setOnClickListener {
            val intent = Intent(this, Seed_Order::class.java)
            startActivity(intent)

        }
        btnFarmerDetails.setOnClickListener {
            val intent = Intent(this, Farmer_All_Details::class.java)
            startActivity(intent)

        }
        btnOrderDetails.setOnClickListener {
            val intent = Intent(this, Requested_crop_orders::class.java)
            startActivity(intent)

        }


//        val FarmerDetails = findViewById<ImageView>(R.id.farmerdetailsimg)
//        FarmerDetails.setOnClickListener {
//            val Intent = Intent(this,Enter_Farmer_Details::class.java)
//            startActivity(Intent)
//        }
//
//        val fretilizeOrder = findViewById<ImageView>(R.id.orderfrtilizerimg)
//        fretilizeOrder.setOnClickListener {
//            val Intent = Intent(this,Fretilize_Order::class.java)
//            startActivity(Intent)
//        }
//
//        val addIteam = findViewById<ImageView>(R.id.sellimg)
//        addIteam.setOnClickListener {
//            val Intent = Intent(this,Add_Iteam::class.java)
//            startActivity(Intent)
//        }
//
//        val seedsOrder = findViewById<ImageView>(R.id.orderseedimg)
//        seedsOrder.setOnClickListener {
//            val Intent = Intent(this,Seed_Order::class.java)
//            startActivity(Intent)
//        }
//
//        val profile = findViewById<ImageView>(R.id.imageButton6)
//        profile.setOnClickListener {
//            val Intent = Intent(this,Farmer_All_Details::class.java)
//            startActivity(Intent)
//        }
//
//        val Orders = findViewById<ImageView>(R.id.imageButton7)
//        Orders.setOnClickListener {
//            val Intent = Intent(this,Requested_crop_orders::class.java)
//            startActivity(Intent)
//        }

    }
}