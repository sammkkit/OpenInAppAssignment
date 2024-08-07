package com.example.openinapp.Presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CheckCircle
//import androidx.compose.material.icons.filled.HelpOutline
//import androidx.compose.material.icons.filled.WhatsApp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.openinapp.Presentation.ViewModel.DashBoardViewModel

@Composable
fun SupportButtons(viewModel: DashBoardViewModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SupportButton(
            text = "Talk with us",
            icon = Icons.Default.Call,
            backgroundColor = Color(0xFFE8F5E9),
            borderColor = Color(0xFF4CAF50)
        )

        SupportButton(
            text = "Frequently Asked Questions",
            icon = Icons.Default.CheckCircle,
            backgroundColor = Color(0xFFE3F2FD),
            borderColor = Color(0xFF64B5F6)
        )
    }
}

@Composable
fun SupportButton(
    text: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    backgroundColor: Color,
    borderColor: Color
) {
    TextButton(
        onClick = { /* TODO */ },
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(backgroundColor)
            .border(1.dp, borderColor, RoundedCornerShape(12.dp))
    ) {
        Row(
        ) {
            Icon(imageVector = icon, contentDescription = null, tint = borderColor)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = text, fontSize = 18.sp, color = Color.Black)
        }
    }
}
