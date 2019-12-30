package com.ivanalvarado.template.di.module

import android.app.Application
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ivanalvarado.template.BuildConfig
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module(includes = [LoggingModule::class])
class NetworkModule {

    @Provides
    @Singleton
    internal fun provideGson(): Gson {
        val gsonBuilder = GsonBuilder()
        return gsonBuilder.create()
    }

    @Provides
    @Singleton
    internal fun provideCache(application: Application): Cache {
        val cacheSize = (10 * 1024 * 1024).toLong() // 10 MB
        val httpCacheDirectory = File(application.cacheDir, "http-cache")
        return Cache(httpCacheDirectory, cacheSize)
    }

    @Provides
    @Singleton
    internal fun provideOkHttpClient(
        cache: Cache,
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {

        val okHttpClient = OkHttpClient.Builder()
        okHttpClient.cache(cache)
        okHttpClient.addInterceptor(loggingInterceptor)
        okHttpClient.callTimeout(60, TimeUnit.SECONDS)
        okHttpClient.connectTimeout(60, TimeUnit.SECONDS)
        okHttpClient.readTimeout(60, TimeUnit.SECONDS)
        return okHttpClient.build()
    }

    @Provides
    @Singleton
    internal fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .build()
    }
}