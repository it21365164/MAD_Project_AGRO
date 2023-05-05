package com.example.agro.models

data class EmployeeModel (
    var cropId : String? = null,
    var cropName: String? = null,
    var cropWeight : String? = null,
    var cropLocation : String? = null,

    var cultivatedId : String? = null,
    var cultivatedLocation: String? = null,
    var cultivatedCrop : String? = null,
    var cultivatedArea : String? = null,

    var name : String? = null,
    var address: String? = null,
    var tel : String? = null,
    var eMail : String? = null,
    var passward : String? = null

        )