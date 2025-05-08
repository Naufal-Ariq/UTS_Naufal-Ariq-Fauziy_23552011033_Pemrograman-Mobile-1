package com.example.nafstore

import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash_screen)

            val logo = findViewById<ImageView>(R.id.logoImageView)
            val anim = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            logo.startAnimation(anim)

            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }, 2500)
        }
    }

