package com.example.signin_signup_10.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.signin_signup_10.R

class SignInActivity : AppCompatActivity() {

    private lateinit var et_email : EditText
    private lateinit var et_password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        initViews()
    }

    private fun initViews(){
        et_email = findViewById<EditText>(R.id.et_email)
        et_password = findViewById<EditText>(R.id.et_password)
        val btn_signin = findViewById<Button>(R.id.btn_signin)
        val tv_signup = findViewById<TextView>(R.id.tv_signup)

        btn_signin.setOnClickListener{
            openHomeActivity()
        }
        tv_signup.setOnClickListener {
            openSignUpActivity()
        }
    }

    private fun openHomeActivity(){
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun openSignUpActivity(){
        startActivity(Intent(this, SignUpActivity::class.java))
    }
}