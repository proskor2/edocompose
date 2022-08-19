package ru.seversknet.edocompose.ui.navigation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun DrawerItem(item: NavDrawerItems, selected: Boolean, onItemClick: () -> Unit) {
    Text(text = item.title)
}