package com.example.testprepare

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.testprepare.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "App"
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add(0, 0, 0, "Cal")
        menu?.add(0, 1, 0, "Dice")
        menu?.add(0, 2, 0, "Watch")
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            0 -> startActivity(Intent(this, CalActivity::class.java))
            1 -> startActivity(Intent(this, DiceActivity::class.java))
            2 -> startActivity(Intent(this, WacthActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}