package com.example.aichatbot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aichatbot.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.generateimgbtn.setOnClickListener{
            startActivity(Intent(this,Imageactivity::class.java))
        }

        binding.chatwithBot.setOnClickListener{
            startActivity(Intent(this,Chatactivity::class.java))
        }
    }
}