package com.dennis.intermovie.data.source.remote

import com.dennis.intermovie.data.source.remote.dto.PopularMoviesDto
import retrofit2.http.GET

interface InterMovieApiService {

    @GET("movie/popular")
    suspend fun getPopularMovies(): PopularMoviesDto

    companion object {
        const val BASE_URL: String = "https://api.themoviedb.org/3/"
    }
}