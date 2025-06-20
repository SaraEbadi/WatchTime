package com.example.watchtime.data.network

import com.example.watchtime.data.model.MovieResponse
import com.example.watchtime.data.model.ResponseList
import retrofit2.http.GET

interface ApiService {

    @GET("")
    suspend fun getMovies(): ResponseList<MovieResponse>
}