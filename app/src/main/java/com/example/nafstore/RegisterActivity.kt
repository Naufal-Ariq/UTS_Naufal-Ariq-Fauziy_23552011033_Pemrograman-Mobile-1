package com.example.nafstore

import android.content.Intent
import android.util.Log
import android.widget.Button
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_register)

            val btnRegister = findViewById<Button>(R.id.registerButton)
            val username = findViewById<EditText>(R.id.usernameInput)
            val email = findViewById<EditText>(R.id.emailInput)
            val password = findViewById<EditText>(R.id.passwordInput)

            btnRegister.setOnClickListener {
                val user = username.text.toString()
                val mail = email.text.toString()
                val pass = password.text.toString()

                Log.d("REGISTER", "User: $user, Email: $mail, Password: $pass")
                Toast.makeText(this, "Registrasi berhasil!", Toast.LENGTH_SHORT).show()

                // Kembali ke Login
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }
    }

