package com.ridho_18104020.praktikum14.`interface`

import com.ridho_18104020.praktikum14.model.Login
import com.ridho_18104020.praktikum14.model.Quote

interface MainView {
    fun showMessage(messsage : String)
    fun resultQuote(data: ArrayList<Quote>)
    fun resultLogin(data: Login)

}

