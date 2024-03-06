package com.example.dependency_injection.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dependency_injection.data.FactoryBicycle

class BicycleViewModelFactory(
    private val bicycleFactory: FactoryBicycle
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BicycleViewModel(bicycleFactory) as T
    }
}