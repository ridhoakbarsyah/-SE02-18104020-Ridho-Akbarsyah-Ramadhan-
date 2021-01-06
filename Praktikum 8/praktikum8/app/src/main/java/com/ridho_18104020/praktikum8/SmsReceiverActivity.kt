package com.ridho_18104020.praktikum8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_sms_receiver.*

class SmsReceiverActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_SMS_NO = "extra_sms_no"
        const val EXTRA_SMS_MESSAGE = "extra_sms_message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms_receiver)

        title = getString(R.string.incoming_message)
        val senderNo = intent.getStringExtra(EXTRA_SMS_NO)
        val senderMsg = intent.getStringExtra(EXTRA_SMS_MESSAGE)
        val tvFrom: TextView = findViewById(R.id.tv_from)
        val tvMsg:TextView = findViewById(R.id.tv_message)
        val btnClose: Button = findViewById(R.id.btn_close)

        tvFrom.text = getString(R.string.coming_from) + ": "+senderNo
        if(EXTRA_SMS_MESSAGE.contains("hadiah") || EXTRA_SMS_MESSAGE.contains("pulsa")){
            tvMsg.text = "Ini Penipuan"
        }else{
            tvMsg.text = senderMsg
        }
        btnClose.setOnClickListener { finish() }
    }
}
