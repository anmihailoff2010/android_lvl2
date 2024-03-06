package com.example.dependency_injection

import android.app.Application
import com.example.dependency_injection.di.dagger.AppDaggerComponent
import com.example.dependency_injection.di.koin.appModule
import com.example.dependency_injection.di.koin.bicycleModule
import com.example.dependency_injection.di.koin.frameModule
import com.example.dependency_injection.di.koin.wheelModule
import com.example.dependency_injection.di.dagger.DaggerAppDaggerComponent
import org.koin.core.context.startKoin

class App : Application() {
    lateinit var appDaggerComponent: AppDaggerComponent

    override fun onCreate() {
        super.onCreate()

        appDaggerComponent = DaggerAppDaggerComponent.create()

        startKoin {
            modules(listOf(appModule, bicycleModule, frameModule, wheelModule))
        }
    }
}

const val TAG = "DaggerApp"