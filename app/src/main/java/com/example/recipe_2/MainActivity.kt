package com.example.recipe_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val breakfastImage = findViewById<ImageView>(R.id.imageView)

        breakfastImage.setOnClickListener {
            setContentView(R.layout.breakfast)
        }
    }
}