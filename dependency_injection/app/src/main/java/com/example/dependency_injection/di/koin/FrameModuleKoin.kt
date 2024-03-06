package com.example.dependency_injection.di.koin

import com.example.dependency_injection.data.FactoryFrame
import org.koin.dsl.module

val frameModule = module {
    factory {
        FactoryFrame()
    }
}