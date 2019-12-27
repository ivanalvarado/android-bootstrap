package com.ivanalvarado.template.di.module

import com.ivanalvarado.template.network.services.ExampleApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class ServiceModule {

    @Provides
    @Singleton
    internal fun provideExampleApiService(retrofit: Retrofit): ExampleApiService {
        return retrofit.create(ExampleApiService::class.java)
    }
}