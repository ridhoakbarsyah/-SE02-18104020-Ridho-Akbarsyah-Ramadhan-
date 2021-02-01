package com.ridho_18104020.praktikum14.model

import com.google.gson.annotations.SerializedName

data class Login(
    @SerializedName("token")
    var token: String? = null,
    @SerializedName("message")
    var message: String? = null
)