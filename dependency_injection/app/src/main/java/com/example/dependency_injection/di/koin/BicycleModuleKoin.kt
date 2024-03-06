package com.example.dependency_injection.di.koin

import com.example.dependency_injection.data.FactoryBicycle
import org.koin.dsl.module

val bicycleModule = module {
    factory {
        FactoryBicycle(
            frameFactory = get(),
            wheelFactory = get()
        )
    }
}