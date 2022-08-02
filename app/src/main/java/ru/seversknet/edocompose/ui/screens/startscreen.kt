package ru.seversknet.edocompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ru.seversknet.edocompose.R


@Composable
fun startscreen() {
    Surface(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentScale = ContentScale.Crop,
            contentDescription = "background"
        )

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
        ) {
            Image(painter = painterResource(id = R.drawable.iconedosmall), contentDescription = "icon1")
            Text(text = "EDO")
            TextField(value = "Login", onValueChange = {})
            TextField(value = "Password", onValueChange = {})
            Button(onClick = {  }) {
                Text(text = "Enter")
            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun showstartscreen() {
    startscreen()
}