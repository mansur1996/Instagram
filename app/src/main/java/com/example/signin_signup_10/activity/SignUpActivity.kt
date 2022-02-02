package com.example.signin_signup_10.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.signin_signup_10.R

class SignUpActivity : AppCompatActivity() {

    private lateinit var et_fullname : EditText
    private lateinit var et_email : EditText
    private lateinit var et_password : EditText
    private lateinit var et_cpassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        initViews()
    }
    private fun initViews(){
        et_fullname = findViewById<EditText>(R.id.et_fullname)
        et_email = findViewById<EditText>(R.id.et_email)
        et_password = findViewById<EditText>(R.id.et_password)
        et_cpassword = findViewById<EditText>(R.id.et_cpassword)
        val btn_signup = findViewById<Button>(R.id.btn_signup)
        val tv_signin = findViewById<TextView>(R.id.tv_signin)

        btn_signup.setOnClickListener {
            finish()
        }

        tv_signin.setOnClickListener {
            finish()
        }
    }
}