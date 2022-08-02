package ru.seversknet.edocompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ru.seversknet.edocompose.R
import ru.seversknet.edosevadm.models.Author

@Composable
fun listitem(
    theme: String,
    type: String,
    deadline: String,
    author: Author
) {
    Surface() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "imagedoc"
            )
            Column() {
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