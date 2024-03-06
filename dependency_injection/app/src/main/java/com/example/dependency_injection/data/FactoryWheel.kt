package com.example.dependency_injection.data

import com.example.dependency_injection.entity.Wheel
import kotlin.random.Random

class FactoryWheel {
    fun createWheel(): Wheel {
        return WheelDto(Random.nextInt(0,999999).toString())
    }
}