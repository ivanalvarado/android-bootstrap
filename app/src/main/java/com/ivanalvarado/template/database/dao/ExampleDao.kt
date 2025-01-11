package com.ivanalvarado.template.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ivanalvarado.template.database.entity.ExampleEntity

@Dao
interface ExampleDao {

    /* Method to insert the movies fetched from api
     * to room */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(examples: List<ExampleEntity>): LongArray

    /* Method to fetch the movies stored locally */
    @Query("SELECT * FROM `ExampleEntity`")
    fun getMoviesByPage(): List<ExampleEntity>
}
