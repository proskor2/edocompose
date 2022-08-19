package ru.seversknet.edocompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ru.seversknet.edocompose.R
import ru.seversknet.edocompose.ui.theme.MainColor
import ru.seversknet.edocompose.ui.theme.MaindarkColor
import ru.seversknet.edocompose.ui.theme.WhiteColor


@Composable
fun StartScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
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
                    .size(200.dp, 200.dp)
            )
            Text(
                text = stringResource(id = R.string.adm_sev),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .size(22.dp),
                textAlign = TextAlign.Center,
                color = MaindarkColor,
                overflow = TextOverflow.Clip
            )
            Text(
                text = stringResource(id = R.string.edo),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 2.dp)
                    .size(22.dp),
                textAlign = TextAlign.Center,
                color = MaindarkColor,
                overflow = TextOverflow.Clip
            )
            Spacer(modifier = Modifier.padding(10.dp))
            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.size(250.dp, 50.dp),
                label = {
                    Text(
                        text = stringResource(id = R.string.login)
                    )
                })
            Spacer(modifier = Modifier.padding(1.dp))
            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.size(250.dp, 50.dp),
                label = {
                    Text(
                        text = stringResource(id = R.string.password)
                    )
                })
            Spacer(modifier = Modifier.padding(10.dp))
            Button(
                onClick = { },
                modifier = Modifier
                    .size(250.dp, 50.dp),
                colors = ButtonDefaults.buttonColors(MainColor),
            ) {
                Text(
                    text = stringResource(id = R.string.entrance_button),
                    color = WhiteColor,
                    fontSize = 17.sp
                )
            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun showstartscreen() {

}