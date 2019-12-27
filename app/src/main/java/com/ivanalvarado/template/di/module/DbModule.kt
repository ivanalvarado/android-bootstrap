package com.ivanalvarado.template.di.module

import android.app.Application
import androidx.room.Room
import com.ivanalvarado.template.database.AppDatabase
import com.ivanalvarado.template.database.dao.ExampleDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DbModule {

    @Provides
    @Singleton
    internal fun provideDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(
            application, AppDatabase::class.java, "AndroidBootstrap.db"
        ).allowMainThreadQueries().build()
    }

    @Provides
    @Singleton
    internal fun provideExampleDao(appDatabase: AppDatabase): ExampleDao {
        return appDatabase.exampleDao()
    }
}