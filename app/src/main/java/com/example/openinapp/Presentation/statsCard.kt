package com.example.openinapp.Presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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

//@Composable
//fun StatSection() {
//    Row(
//        horizontalArrangement = Arrangement.SpaceBetween,
//        modifier = Modifier.padding(horizontal = 16.dp)
//    ) {
//        StatsCard(icon = Icons.Default.Home, value = "123", label = "Today's clicks")
//        StatsCard(icon = Icons.Default.LocationOn, value = "Ahmedabad", label = "Top Location")
//        StatsCard(icon = Icons.Default.Lock, value = "Instagram", label = "Top source")
//        StatsCard(icon = Icons.Default.Lock, value = "Instagram", label = "Top source")
//        StatsCard(icon = Icons.Default.Lock, value = "Instagram", label = "Top source")
//    }
//}

@Composable
fun StatsCard(icon: ImageVector, value: String, label: String) {
    Column(
        modifier = Modifier
            .width(160.dp)
            .height(160.dp)
            .clip(RoundedCornerShape(11.dp))
            .background(Color.White)
            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF5C33CF),
            modifier = Modifier.size(42.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(value, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(14.dp))

        Text(label, fontSize = 18.sp, color = Color.Gray)
    }
}

@Preview
@Composable
fun prevvv() {
    StatsCard(icon = Icons.Default.Home, value = "123", label = "Today's clicks")
}