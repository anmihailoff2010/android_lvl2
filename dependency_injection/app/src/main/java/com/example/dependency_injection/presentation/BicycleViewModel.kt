package com.example.dependency_injection.presentation

import androidx.lifecycle.ViewModel
import com.example.dependency_injection.data.FactoryBicycle
import com.example.dependency_injection.entity.Bike
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow

class BicycleViewModel(
    val bikeFactory: FactoryBicycle
) : ViewModel() {
    private lateinit var currentBike: Bike

    private val _bike = Channel<Bike>()
    val bike = _bike.receiveAsFlow()

    fun createBikeDagger(
        frame: String,
        logo: String,
        color: Int
    ) {
        currentBike = bikeFactory.createBicycle(logo, frame, color)
        kotlinx.coroutines.runBlocking {
            _bike.send(currentBike)
        }
    }

    fun createBikeKoin(
        frame: String,
        logo: String,
        color: Int
    ) {
        currentBike = bikeFactory.createBicycle(logo, frame, color)
        kotlinx.coroutines.runBlocking {
            _bike.send(currentBike)
        }
    }
}