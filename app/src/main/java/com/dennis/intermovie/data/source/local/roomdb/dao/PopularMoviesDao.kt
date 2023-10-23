package com.dennis.intermovie.data.source.local.roomdb.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dennis.intermovie.data.source.local.roomdb.entity.PopularMoviesEntity
import com.dennis.intermovie.domain.model.PopularMovies

@Dao
interface PopularMoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPopularMovieList(movies: List<PopularMoviesEntity>)

    @Query("SELECT * FROM ${PopularMoviesEntity.TABLE_NAME}")
    suspend fun getPopularMovieList(): List<PopularMovies>

    @Query("DELETE FROM ${PopularMoviesEntity.TABLE_NAME}")
    suspend fun deleteAll()
}