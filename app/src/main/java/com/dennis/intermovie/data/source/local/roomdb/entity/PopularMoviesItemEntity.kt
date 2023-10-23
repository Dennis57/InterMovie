package com.dennis.intermovie.data.source.local.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dennis.intermovie.domain.model.PopularMoviesItem

@Entity(tableName = PopularMoviesItemEntity.TABLE_NAME)
data class PopularMoviesItemEntity(
    @PrimaryKey val id: Int?,
    val title: String?,
    val overview: String?,
    @ColumnInfo(name = "poster_path") val posterPath: String?,
    @ColumnInfo(name = "release_date") val releaseDate: String?
) {
    fun toPopularMoviesResults(): PopularMoviesItem {
        return PopularMoviesItem(
            title = title,
            overview = overview,
            posterPath = posterPath,
            releaseDate = releaseDate
        )
    }
    companion object {
        const val TABLE_NAME = "popular_movies_results"
    }
}
