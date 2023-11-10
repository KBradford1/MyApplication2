package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_name_logo)
        val legacyOfLangstonCardView = findViewById<CardView>(R.id.legacy_of_langston)
        val blackCinemaCardView = findViewById<CardView>(R.id.black_cinema)
        val blackLegacyCardView = findViewById<CardView>(R.id.black_legacy)
        val rhythmsOfResilienceCardView = findViewById<CardView>(R.id.Rythms_of_Resilience)
        val quizNameLogoImageView = findViewById<ImageView>(R.id.quizNameLogoImageView)

                // You can set click listeners or any other desired functionality for each CardView here

                legacyOfLangstonCardView.setOnClickListener {
                    // Add your functionality here
                }

                blackCinemaCardView.setOnClickListener {
                    // Add your functionality here
                }

                blackLegacyCardView.setOnClickListener {
                    // Add your functionality here
                }

                rhythmsOfResilienceCardView.setOnClickListener {
                    // Add your functionality here
                }
            }
        }