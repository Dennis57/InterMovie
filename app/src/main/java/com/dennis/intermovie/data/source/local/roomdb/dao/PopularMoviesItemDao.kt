package com.dennis.intermovie.data.source.local.roomdb.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dennis.intermovie.data.source.local.roomdb.entity.PopularMoviesItemEntity
import com.dennis.intermovie.domain.model.PopularMoviesItem

@Dao
interface PopularMoviesItemDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPopularMovieList(movies: List<PopularMoviesItemEntity>)

    @Query("SELECT * FROM ${PopularMoviesItemEntity.TABLE_NAME}")
    suspend fun getPopularMovieList(): List<PopularMoviesItem>

    @Query("DELETE FROM ${PopularMoviesItemEntity.TABLE_NAME}")
    suspend fun deleteAll()
}