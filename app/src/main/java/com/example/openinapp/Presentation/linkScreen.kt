package com.example.openinapp.Presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.openinapp.Presentation.ViewModel.DashBoardViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LinksScreen(viewModel: DashBoardViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(16.dp)
//            .verticalScroll(rememberScrollState())
    ) {
        TopBarSection()

        Spacer(modifier = Modifier.height(16.dp))

        for (i in 1..4) {
            LinkCard()
            Spacer(modifier = Modifier.height(8.dp))
        }

        Spacer(modifier = Modifier.height(16.dp))

        ViewAllLinksButton()
    }
}

@Composable
fun TopBarSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            TextButton(
                onClick = { /* TODO */ },
                colors = ButtonDefaults.textButtonColors(
                    containerColor = Color(0xFF0E6FFF),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(50)
            ) {
                Text(text = "Top Links", fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(8.dp))
            TextButton(
                onClick = { /* TODO */ },
                colors = ButtonDefaults.textButtonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Gray
                ),
                shape = RoundedCornerShape(50)
            ) {
                Text(text = "Recent Links", fontWeight = FontWeight.Bold)
            }
        }

        IconButton(onClick = { /* TODO */ }) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon"
            )
        }
    }
}

@Composable
fun LinkCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp)),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Placeholder for the logo (replace with Image composable as needed)
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(Color.Gray, shape = RoundedCornerShape(8.dp))
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = "Sample link name...", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = "22 Aug 2022", color = Color.Gray, fontSize = 14.sp)
                }
                Spacer(modifier = Modifier.width(8.dp))
                Column(horizontalAlignment = Alignment.End) {
                    Text(text = "2323", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = "Clicks", color = Color.Gray, fontSize = 14.sp)
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "https://samplelink.oia.bio/ashd...", color = Color(0xFF0E6FFF), fontSize = 14.sp)
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = { /* TODO: Copy link */ }) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Copy Link",
                        tint = Color.Gray
                    )
                }
            }
        }
    }
}

@Composable
fun ViewAllLinksButton() {
    TextButton(
        onClick = { /* TODO: View all links */ },
        colors = ButtonDefaults.textButtonColors(
            containerColor = Color.White,
            contentColor = Color(0xFF0E6FFF)
        ),
        modifier = Modifier
            .fillMaxWidth()
//            .clip(RoundedCornerShape(50))
            .border(
            border = BorderStroke(1.dp, Color.LightGray),
            shape = RoundedCornerShape(10.dp)
        ),

        shape = RoundedCornerShape(50)
    ) {
        Icon(
            imageVector = Icons.Default.ThumbUp, // Replace with the appropriate icon
            contentDescription = "View all Links Icon",
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "View all Links", fontWeight = FontWeight.Bold)
    }
}
