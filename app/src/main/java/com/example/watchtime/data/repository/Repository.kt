package com.example.watchtime.data.repository

import com.example.watchtime.data.model.MovieResponse
import com.example.watchtime.data.model.ResponseList
import com.example.watchtime.data.network.ApiService

class Repository(private val apiService: ApiService): IRepository {

    override suspend fun getMovies(): ResponseList<MovieResponse> {
        return apiService.getMovies()
    }
}