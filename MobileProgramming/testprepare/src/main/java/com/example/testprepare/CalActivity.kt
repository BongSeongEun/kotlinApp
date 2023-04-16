package com.example.testprepare

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testprepare.databinding.ActivityCalBinding

class CalActivity : AppCompatActivity() {
    lateinit var binding: ActivityCalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCalBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        title = "Calculator"

        binding.mainBtn.setOnClickListener{
            finish()
        }
    }
}