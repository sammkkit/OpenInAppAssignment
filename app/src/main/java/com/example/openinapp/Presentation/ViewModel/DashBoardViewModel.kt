package com.example.openinapp.Presentation.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.openinapp.data.repository.repository
import com.example.openinapp.domain.model.ApiResponse
import kotlinx.coroutines.launch

class DashBoardViewModel(
    private val repository: repository
) : ViewModel() {

    private val _dashboardData = MutableLiveData<ApiResponse?>()
    val dashboardData: LiveData<ApiResponse?> get() = _dashboardData

    init {
        fetchDashboardData()
    }

    fun fetchDashboardData() {
        viewModelScope.launch {
            try {
                val data = repository.getDashboardData()
                _dashboardData.postValue(data)
            } catch (e: Exception) {
                Log.e("DashBoardViewModel", "Error fetching dashboard data", e)
                _dashboardData.postValue(null)
            }
        }
    }
}
