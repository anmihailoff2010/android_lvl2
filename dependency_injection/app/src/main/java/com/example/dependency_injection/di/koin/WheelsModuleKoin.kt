package com.example.dependency_injection.di.koin

import com.example.dependency_injection.data.FactoryWheel
import org.koin.dsl.module

val wheelModule = module {
    single {
        FactoryWheel()
    }
}