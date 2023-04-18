package com.example.testprepare

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testprepare.databinding.ActivityDiceBinding

class DiceActivity : AppCompatActivity() {
    lateinit var binding: ActivityDiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Dice"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}