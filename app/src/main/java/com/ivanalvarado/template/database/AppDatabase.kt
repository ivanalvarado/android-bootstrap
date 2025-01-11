package com.ivanalvarado.template.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ivanalvarado.template.database.dao.ExampleDao
import com.ivanalvarado.template.database.entity.ExampleEntity

@Database(entities = [ExampleEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun exampleDao(): ExampleDao
}
