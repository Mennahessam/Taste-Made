package com.example.recipe_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Meals : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.breakfast)

        val foodimage = findViewById<ImageView>(R.id.imageView2)

        foodimage.setOnClickListener {
            setContentView(R.layout.food_1)
        }
    }
}