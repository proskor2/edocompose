package ru.seversknet.edocompose.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.compose.rememberNavController
import ru.seversknet.edocompose.ui.components.TopBar
import ru.seversknet.edocompose.ui.navigation.Drawer
import ru.seversknet.edocompose.ui.navigation.MainNavigation
import ru.seversknet.edocompose.ui.theme.MainColor
import ru.seversknet.edocompose.ui.theme.MaindarkColor
import ru.seversknet.edocompose.ui.theme.WhiteColor

@Composable
fun MainScreen() {
    var scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopBar(scope = scope, scaffoldState = scaffoldState)
        },
        drawerBackgroundColor = WhiteColor,
        drawerContent = {
            Drawer(scope = scope, scaffoldState = scaffoldState, navController = navController)
        },
        backgroundColor = WhiteColor
    ) {

    }

}


@Preview(showBackground = true)
@Composable
fun showmainscreen() {
    MainScreen()
}