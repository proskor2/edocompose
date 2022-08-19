package ru.seversknet.edocompose.ui.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import kotlinx.coroutines.CoroutineScope
import ru.seversknet.edocompose.R
import ru.seversknet.edocompose.ui.theme.MainColor

@Composable
fun Drawer(
    scope: CoroutineScope, scaffoldState: ScaffoldState, navController: NavController
    ) {
    val items = listOf(
        NavDrawerItems.Events,
        NavDrawerItems.Review
    )

    Surface(
        modifier = Modifier
            .height(100.dp)
            .width(300.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.iconedosmall),
            contentDescription = "iconsmall"
        )
    }

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    items.forEach() { item ->
        DrawerItem(item = item, selected = currentRoute == item.route) {
            navController.navigate(item.route) {
                navController.graph.startDestinationRoute?.let { route ->
                    popUpTo(route) {
                        saveState = true
                    }
                }
                launchSingleTop = true
                restoreState = true
            }
        }
    }
}