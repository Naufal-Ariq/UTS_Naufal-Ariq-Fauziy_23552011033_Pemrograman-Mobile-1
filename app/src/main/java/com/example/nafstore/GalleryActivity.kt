package com.example.nafstore

import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GalleryActivity : AppCompatActivity() {
        private val productNames = arrayOf("Kaos", "Jaket", "Hoodie", "Celana", "Topi", "Sweater")
        private val productImages = arrayOf(
            R.drawable.product1, R.drawable.product2,
            R.drawable.product3, R.drawable.product4,
            R.drawable.product5, R.drawable.product6
        )

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_gallery)

            val gridView = findViewById<GridView>(R.id.gridView)
            val adapter = ProductAdapter(this, productNames, productImages)
            val backButton = findViewById<Button>(R.id.backButton)
            backButton.setOnClickListener {
                finish() // Kembali ke activity sebelumnya
            }

            gridView.adapter = adapter
        }
    }

