package ru.seversknet.edocompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.seversknet.edocompose.ui.screens.MainScreen
import ru.seversknet.edocompose.ui.screens.StartScreen
import ru.seversknet.edocompose.ui.screens.listscreen

@Composable
fun MainNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavDrawerItems.Events.route) {
        composable(NavDrawerItems.Events.route) {
            MainScreen()
        }

        composable(NavDrawerItems.Review.route) {

        }
    }
}