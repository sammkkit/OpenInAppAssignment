package com.example.openinapp.Presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun BottomNavigation() {
    var selectedItem by remember { mutableStateOf(0) }

    NavigationBar {
        val items = listOf(
            NavigationItem("Links", Icons.Default.MailOutline),
            NavigationItem("Courses", Icons.Default.Notifications),
            NavigationItem("Add", Icons.Default.AddCircle),
            NavigationItem("Campaign", Icons.Default.ShoppingCart),
            NavigationItem("Profile", Icons.Default.AccountCircle)
        )

        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(imageVector = item.icon, contentDescription = item.label)
                },
                label = { Text(item.label) },
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}
data class NavigationItem(val label: String, val icon: ImageVector)