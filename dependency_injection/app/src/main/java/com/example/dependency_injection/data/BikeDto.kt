package com.example.dependency_injection.data

import com.example.dependency_injection.entity.Bike
import com.example.dependency_injection.entity.Frame
import com.example.dependency_injection.entity.Wheel

data class BikeDto(
    override val frame: Frame,
    override val wheels: List<Wheel>,
    override val logo: String
) : Bike