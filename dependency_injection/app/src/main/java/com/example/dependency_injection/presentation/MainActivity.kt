package com.example.dependency_injection.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.dependency_injection.App
import com.example.dependency_injection.R
import com.example.dependency_injection.TAG
import com.example.dependency_injection.databinding.ActivityMainBinding
import com.example.dependency_injection.di.dagger.AppDaggerComponent

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var appComponent: AppDaggerComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        appComponent = (applicationContext as App).appDaggerComponent
        appComponent.inject(this)

        binding.btnDagger.setOnClickListener {
            Log.d(TAG, "onCreate: btnDagger clicked")
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_container, FragmentDagger())
                .commit()
        }

        binding.btnKoin.setOnClickListener {
            Log.d(TAG, "onCreate: btnKoin clicked")
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_container, FragmentKoin())
                .commit()
        }
    }
}