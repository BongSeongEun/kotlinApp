package com.example.testprepare

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testprepare.databinding.ActivityCalBinding

class CalActivity : AppCompatActivity() {
    lateinit var binding: ActivityCalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Calculator"

        binding.mainBtn.setOnClickListener{
            finish()
        }
    }
}