package com.example.dependency_injection.entity

interface Bike {
    val frame: Frame
    val wheels: List<Wheel>
    val logo: String
}