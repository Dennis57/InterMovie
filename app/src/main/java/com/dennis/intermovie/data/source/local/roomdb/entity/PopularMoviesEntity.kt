package com.dennis.intermovie.data.source.local.roomdb.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dennis.intermovie.domain.model.PopularMovies

@Entity(tableName = PopularMoviesEntity.TABLE_NAME)
data class PopularMoviesEntity(
    @PrimaryKey(autoGenerate = true)
    val primaryKeyId: Int? = null,

    val page: Int?,

    val results: List<PopularMoviesItemEntity>?
) {

    fun toPopularMovies() : PopularMovies {
        return PopularMovies(
            page = page,
            results = results?.map {
                it.toPopularMoviesItem()
            }
        )
    }
    companion object {
        const val TABLE_NAME = "popular_movies"
    }
}
