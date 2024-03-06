package com.example.views_and_animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.views_and_animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, FragmentTimer())
            .commit()
    }
}