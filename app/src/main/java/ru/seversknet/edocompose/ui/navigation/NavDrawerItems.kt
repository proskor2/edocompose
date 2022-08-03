package ru.seversknet.edocompose.ui.navigation

import ru.seversknet.edocompose.R

sealed class NavDrawerItems(var route: String, var icon: Int, var title: String){
    object Events: NavDrawerItems("events_screen", R.drawable.ic_check, "Events")
    object Review: NavDrawerItems("review_screen", R.drawable.ic_check, "Review")
}
