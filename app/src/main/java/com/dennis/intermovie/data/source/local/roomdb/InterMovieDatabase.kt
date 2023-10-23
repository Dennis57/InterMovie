package com.dennis.intermovie.data.source.local.roomdb

import androidx.room.Database
import com.dennis.intermovie.data.source.local.roomdb.entity.PopularMoviesEntity
import com.dennis.intermovie.data.source.local.roomdb.entity.PopularMoviesItemEntity

@Database(
    entities = [
        PopularMoviesEntity::class,
        PopularMoviesItemEntity::class
    ],
    version = 1,
    exportSchema = false
)
class InterMovieDatabase {
}