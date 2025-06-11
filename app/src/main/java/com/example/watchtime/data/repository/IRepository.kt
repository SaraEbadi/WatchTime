package com.example.watchtime.data.repository

import com.example.watchtime.data.model.MovieResponse
import com.example.watchtime.data.model.ResponseList

interface IRepository {
    suspend fun getMovies(): ResponseList<MovieResponse>
}