package com.example.openinapp.data.repository

import com.example.openinapp.domain.model.ApiResponse
import retrofit2.Response

interface repository {
    suspend fun getDashboardData(): ApiResponse?
}