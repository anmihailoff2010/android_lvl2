package com.example.dependency_injection.di.dagger

import com.example.dependency_injection.data.FactoryBicycle
import com.example.dependency_injection.data.FactoryFrame
import com.example.dependency_injection.data.FactoryWheel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BicycleFactoryModule {
    @Provides
    fun provideFrameFactory(): FactoryFrame {
        return FactoryFrame()
    }

    @Provides
    @Singleton
    fun provideWheelFactory(): FactoryWheel {
        return FactoryWheel()
    }

    @Provides
    fun provideBicycleFactory(
        frameFactory: FactoryFrame,
        wheelFactory: FactoryWheel
    ): FactoryBicycle {
        return FactoryBicycle(frameFactory, wheelFactory)
    }
}