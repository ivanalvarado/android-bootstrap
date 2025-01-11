package com.ivanalvarado.template.di.module

import com.ivanalvarado.template.network.services.ExampleApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ServiceModule {

    @Provides
    internal fun provideExampleApiService(retrofit: Retrofit): ExampleApiService {
        return retrofit.create(ExampleApiService::class.java)
    }
}
