package com.example.dependency_injection.di.dagger

import com.example.dependency_injection.data.FactoryBicycle
import com.example.dependency_injection.presentation.BicycleViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideBicycleViewModelFactory(bicycleFactory: FactoryBicycle): BicycleViewModelFactory {
        return BicycleViewModelFactory(bicycleFactory)
    }
}