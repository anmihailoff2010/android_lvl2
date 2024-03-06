package com.example.dependency_injection.di.koin

import com.example.dependency_injection.presentation.BicycleViewModel
import org.koin.dsl.module

val appModule = module {
    factory {
        BicycleViewModel(bikeFactory = get())
    }
}