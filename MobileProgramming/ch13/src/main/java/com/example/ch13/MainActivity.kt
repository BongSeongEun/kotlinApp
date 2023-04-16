package com.example.ch13

import android.os.Bundle
import android.os.SystemClock.sleep
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.ch13.databinding.ActivityCoroutineBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

class CoroutineActivity : AppCompatActivity() {
    lateinit var binding:ActivityCoroutineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoroutineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val channel = Channel<Int>()
        val backgroundScope = CoroutineScope(Dispatchers.Default)
        binding.clickBtn.setOnClickListener{
            backgroundScope.launch {
                var sum = 0L
                var time = measureTimeMillis {
                    for (i in 1..10){
                        sleep(1000)
                        sum += i
                    }

                }
                Log.d("KKang", "time: $time")
                channel.send(sum.toInt())
            }

        val mainScope = GlobalScope.launch(Dispatchers.Main) {
            channel.consumeEach{
                binding.resultView.text = "sum : $it"
            }
        }
    }}}
