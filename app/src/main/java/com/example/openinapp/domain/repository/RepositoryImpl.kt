package com.example.openinapp.domain.repository

import android.util.Log
import com.example.openinapp.data.remote.ApiService
import com.example.openinapp.data.remote.Retrofit
import com.example.openinapp.data.repository.repository
import com.example.openinapp.domain.model.ApiResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class RepositoryImpl(api: ApiService) :repository {
    private val api = Retrofit.api
    override suspend fun getDashboardData(): ApiResponse? {
        return withContext(Dispatchers.IO) {
            try {
                val response: Response<ApiResponse> = api.getDashboardData()
                if (response.isSuccessful) {
                    response.body()
                } else {
                    // Handle errors
                    null
                }
            } catch (e: Exception) {
                // Handle exceptions
                null
            }
        }
    }
}