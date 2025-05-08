package com.example.nafstore

import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_login)

            val username = findViewById<EditText>(R.id.loginUsername)
            val password = findViewById<EditText>(R.id.loginPassword)
            val btnLogin = findViewById<Button>(R.id.loginButton)
            val registerText = findViewById<TextView>(R.id.goToRegister)

            btnLogin.setOnClickListener {
                val user = username.text.toString()
                val pass = password.text.toString()

                if (user == "admin" && pass == "123") {
                    Toast.makeText(this, "Login berhasil", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, GalleryActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
                }
            }

            registerText.setOnClickListener {
                startActivity(Intent(this, RegisterActivity::class.java))
            }
        }
    }

