package com.example.watchtime.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseList<T>(
    @SerialName("page") val page: Int,
    @SerialName("total_page") val totalPage: Int,
    @SerialName("results") val results: List<T>
)
