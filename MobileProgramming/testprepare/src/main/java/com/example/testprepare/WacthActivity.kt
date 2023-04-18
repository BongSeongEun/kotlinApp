package com.example.testprepare

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testprepare.databinding.ActivityWacthBinding

class WacthActivity : AppCompatActivity() {
    lateinit var binding: ActivityWacthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWacthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Watch"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}