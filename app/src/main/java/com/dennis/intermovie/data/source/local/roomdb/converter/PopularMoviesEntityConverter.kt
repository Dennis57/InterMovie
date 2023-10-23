package com.dennis.intermovie.data.source.local.roomdb.converter

import androidx.room.TypeConverter
import com.dennis.intermovie.data.source.local.roomdb.entity.PopularMoviesItemEntity
import com.dennis.intermovie.domain.model.PopularMoviesItem
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class PopularMoviesEntityConverter {

    @TypeConverter
    fun fromStringToMovieList(value: String): List<PopularMoviesItem>? =
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
            .adapter<List<PopularMoviesItem>>(Types.newParameterizedType(List::class.java, PopularMoviesItem::class.java))
            .fromJson(value)

    @TypeConverter
    fun fromMovieListTypeToString(movieListType: List<PopularMoviesItem>?): String =
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
            .adapter<List<PopularMoviesItem>>(Types.newParameterizedType(List::class.java, PopularMoviesItem::class.java))
            .toJson(movieListType)


    @TypeConverter
    fun fromStringToPopularMoviesItemEntityList(value: String): List<PopularMoviesItemEntity>? =
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build().adapter<List<PopularMoviesItemEntity>>(
                Types.newParameterizedType(
                    List::class.java,
                    PopularMoviesItemEntity::class.java
                )
            ).fromJson(value)

    @TypeConverter
    fun fromPopularMoviesItemEntityListTypeToString(movieEntityListType: List<PopularMoviesItemEntity>?): String =
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build().adapter<List<PopularMoviesItemEntity>>(
                Types.newParameterizedType(
                    List::class.java,
                    PopularMoviesItemEntity::class.java
                )
            ).toJson(movieEntityListType)

}