package com.devspacecinenow

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiService {

    @GET("now_playing?language=en-US&page=1")
    fun getNowPlayingMovies() : Call<MovieReponse>

    @GET("upcoming?language=en-US&page=1")
    fun getUpcamingMovies() : Call<MovieReponse>

    @GET("top_rated?language=en-US&page=1")
    fun getTopRatedMovies() : Call<MovieReponse>

    @GET("popular?language=en-US&page=1")
    fun getPopularMovies() : Call<MovieReponse>

    @GET("{movie_id}?language=en-US")
    fun getMovieId(@Path("movie_id") movieId: String) : Call<MovieDto>
}