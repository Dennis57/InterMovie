package com.dennis.intermovie.data.source.local.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.dennis.intermovie.data.source.local.roomdb.converter.PopularMoviesEntityConverter
import com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesDao
import com.dennis.intermovie.data.source.local.roomdb.dao.PopularMoviesItemDao
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
@TypeConverters(PopularMoviesEntityConverter::class)
abstract class InterMovieDatabase: RoomDatabase() {
    abstract fun getMovieDao(): PopularMoviesItemDao

    abstract fun getPopularMoviesDao(): PopularMoviesDao

    companion object {
        @Volatile
        private var INSTANCE: InterMovieDatabase? = null

        fun getDatabase(context: Context): InterMovieDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    InterMovieDatabase::class.java,
                    "intermovie_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}