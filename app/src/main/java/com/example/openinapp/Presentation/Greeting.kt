package com.example.openinapp.Presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.openinapp.Presentation.ViewModel.DashBoardViewModel

@Composable
fun greeting(
    viewModel: DashBoardViewModel
){
    val dashboardData = viewModel.dashboardData.value
    Column(
        modifier = Modifier
            .background(Color(0xFFF5F5F5))
            .padding(20.dp)
    ) {
        Text("Good morning", color = Color.Gray, fontSize = 21.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Ajay Manva", fontSize = 32.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(8.dp))
            Text("👋", fontSize = 34.sp) // Wave emoji
        }
        Spacer(modifier = Modifier.height(8.dp))
        Spacer(modifier = Modifier.height(24.dp))
        ChartView()
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()), // Enable horizontal scrolling
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            StatsCard(icon = Icons.Default.Home, value = dashboardData?.total_clicks.toString() ?: "NA", label = "Today's clicks")
            StatsCard(icon = Icons.Default.Home, value = "222", label = "Today's clicks")
            StatsCard(icon = Icons.Default.Home, value = "33", label = "Today's clicks")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(Color.White)
                .border(1.dp, Color.Gray, RoundedCornerShape(10.dp))
                .clickable {  }
                .padding(16.dp)
        ) {
            Text(
                text = "📈 View Analytics",
                modifier = Modifier.align(Alignment.Center),
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

    }
}
