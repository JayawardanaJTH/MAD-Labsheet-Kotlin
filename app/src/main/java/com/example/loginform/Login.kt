package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.edit_email)
        val password = findViewById<EditText>(R.id.edit_password)

        val loginClick = findViewById<Button>(R.id.id_btn_login2)

        loginClick.setOnClickListener{
            val ema: String = email.text.toString()
            val pwd: String = password.text.toString()

            if(ema.trim().length == 0){
                Toast.makeText(applicationContext,"Email field cannot be empty", Toast.LENGTH_SHORT).show()
            }
            else if(pwd.trim().length == 0){
                Toast.makeText(applicationContext,"Password field cannot be empty", Toast.LENGTH_SHORT).show()

            }

            else if(ema.contentEquals("abc@xyz") && (pwd.contentEquals("123456"))){
                val intent = Intent(this,Home::class.java)
                startActivity(intent)
            }else {
                Toast.makeText(applicationContext, "Wrong email or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
