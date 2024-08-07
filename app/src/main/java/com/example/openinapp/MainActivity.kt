package com.example.openinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.openinapp.Presentation.Home
import com.example.openinapp.Presentation.ViewModel.DashBoardViewModel
import com.example.openinapp.data.remote.Retrofit
import com.example.openinapp.data.repository.repository
import com.example.openinapp.domain.repository.RepositoryImpl
import com.example.openinapp.ui.theme.OpenInAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(
            this,
            ViewModelFactory(RepositoryImpl(Retrofit.api))
        ).get(DashBoardViewModel::class.java)
        enableEdgeToEdge()
        setContent {
            OpenInAppTheme {
                Home(viewModel)
            }
        }
    }
}
class ViewModelFactory(private val repository: repository) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DashBoardViewModel::class.java)) {
            return DashBoardViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

