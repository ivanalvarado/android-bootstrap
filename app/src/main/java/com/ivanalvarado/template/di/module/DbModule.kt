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

    /*
     * The method returns the Database object
     * */
    @Provides
    @Singleton
    internal fun provideDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(
            application, AppDatabase::class.java, "AndroidBootstrap.db"
        )
            .allowMainThreadQueries().build()
    }


    /*
     * We need the MovieDao module.
     * For this, We need the AppDatabase object
     * So we will define the providers for this here in this module.
     * */
    @Provides
    @Singleton
    internal fun provideMovieDao(appDatabase: AppDatabase): ExampleDao {
        return appDatabase.exampleDao()
    }
}