package ru.seversknet.edocompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.seversknet.edocompose.R
import ru.seversknet.edocompose.ui.theme.MainColor
import ru.seversknet.edocompose.ui.theme.MaindarkColor


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
            horizontalAlignment = CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconedosmall),
                contentDescription = "icon1",
                modifier = Modifier
                    .size(150.dp, 150.dp)
            )
            Text(
                text = stringResource(id = R.string.name_edo),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .size(17.dp),
                textAlign = TextAlign.Center,
                color = MaindarkColor
            )
            Spacer(modifier = Modifier.padding(10.dp))

            TextField(value = stringResource(id = R.string.login), onValueChange = {})
            TextField(value = stringResource(id = R.string.password), onValueChange = {})
            Spacer(modifier = Modifier.padding(10.dp))
            Button(onClick = { }, colors = ButtonDefaults.buttonColors(MainColor)) {
                Text(text = stringResource(id = R.string.entrance_button))
            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun showstartscreen() {
    startscreen()
}