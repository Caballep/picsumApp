package com.example.picsumapp.data.source.remote

import com.example.picsumapp.data.source.remote.dto.PicsumDto
import retrofit2.http.GET
import retrofit2.http.Query

interface PicsumAPI {
    @GET("list")
    suspend fun getWordInfo(
        @Query("page") page: Int,
        @Query("limit") limit: Int = 20
    ): PicsumDto

    companion object {
        const val BASE_URL = "https://picsum.photos/v2/"
    }
}