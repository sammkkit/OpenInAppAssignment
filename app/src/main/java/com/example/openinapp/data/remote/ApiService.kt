package com.example.openinapp.data.remote


import com.example.openinapp.domain.model.ApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {
    @GET("api/v1/dashboardNew")
    suspend fun getDashboardData(
        @Header("Authorization") authHeader: String = "Bearer $AUTH_TOKEN"
    ): Response<ApiResponse>

    companion object{
        val BASE_URL = "https://api.inopenapp.com/api/v1/"
        val AUTH_TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjU5MjcsImlhdCI6MTY3NDU1MDQ1MH0.dCkW0ox8tbjJA2GgUx2UEwNlbTZ7Rr38PVFJevYcXFI"

    }
}