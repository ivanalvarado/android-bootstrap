package com.ivanalvarado.template.di.module

import dagger.Module
import dagger.Provides
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
class LoggingModule {
    @Provides
    @Singleton
    fun providesHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }
}