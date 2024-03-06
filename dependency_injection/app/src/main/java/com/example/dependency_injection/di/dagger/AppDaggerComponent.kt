package com.example.dependency_injection.di.dagger

import com.example.dependency_injection.presentation.FragmentDagger
import com.example.dependency_injection.presentation.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, BicycleFactoryModule::class])
interface AppDaggerComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(fragment: FragmentDagger)
}