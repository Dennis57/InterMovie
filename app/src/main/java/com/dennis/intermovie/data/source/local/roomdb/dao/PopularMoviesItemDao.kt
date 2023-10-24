package com.dennis.intermovie.data.source.local.roomdb.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dennis.intermovie.data.source.local.roomdb.entity.PopularMoviesItemEntity

@Dao
interface PopularMoviesItemDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPopularMovieItemList(movies: List<PopularMoviesItemEntity>)

    @Query("SELECT * FROM ${PopularMoviesItemEntity.TABLE_NAME}")
    suspend fun getPopularMovieList(): List<PopularMoviesItemEntity>

    @Query("DELETE FROM ${PopularMoviesItemEntity.TABLE_NAME}")
    suspend fun deleteAll()
}