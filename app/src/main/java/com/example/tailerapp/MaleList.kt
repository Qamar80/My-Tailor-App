package com.example.tailerapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MaleList : AppCompatActivity() {

    lateinit var shalwar:com.google.android.material.card.MaterialCardView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_male_list)

           shalwar=findViewById(R.id.shalwar_kameez)
        shalwar.setOnClickListener{
            val intent= Intent(this,Shalwar_Kameez::class.java)
            startActivity(intent)
        }



    }
}

