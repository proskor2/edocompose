package ru.seversknet.edocompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.seversknet.edocompose.R
import ru.seversknet.edocompose.ui.theme.Shapes
import ru.seversknet.edosevadm.models.Author

@Composable
fun listitem(
    theme: String,
    type: String,
    deadline: String,
    author: Author
) {
   Card(modifier = Modifier
       .padding(4.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_file),
                    modifier = Modifier
                        .size(80.dp, 100.dp)
                        .fillMaxHeight(),
                    contentDescription = "imagedoc"
                )

            Column(modifier = Modifier
                .fillMaxWidth()
                .weight(3f)) {
                Text(text = type)
                Text(text = theme)
                Text(text = deadline)
                Text(text = author.person)
                Text(text = author.position)
                Text(text = author.organization)
                Text(text = author.department)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun showlistitem() {
    listitem("Theme", "Type", "Deadline", Author("1", "type", "Adm", "Dep", "Position", "Person"))
}