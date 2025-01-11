package com.ivanalvarado.template.di.module

import android.app.Application
import androidx.room.Room
import com.ivanalvarado.template.database.AppDatabase
import com.ivanalvarado.template.database.dao.ExampleDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class DbModule {

    @Provides
    internal fun provideDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(
            application, AppDatabase::class.java, "AndroidBootstrap.db"
        ).allowMainThreadQueries().build()
    }

    @Provides
    internal fun provideExampleDao(appDatabase: AppDatabase): ExampleDao {
        return appDatabase.exampleDao()
    }
}