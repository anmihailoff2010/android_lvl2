package com.example.dependency_injection.data

import com.example.dependency_injection.entity.Wheel

data class WheelDto(
    override val number: String
) : Wheel