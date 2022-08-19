package ru.seversknet.edocompose.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ru.seversknet.edosevadm.models.Tasks

@Composable
fun listscreen(list: List<Tasks>) {
    LazyColumn() {
        items(list) {
            listitem(
                theme = it.theme!!,
                type = it.type!!,
                deadline = it.deadline!!,
                author = it.author!!
            )
        }
    }


}


@Preview(showBackground = true)
@Composable
fun showlistscreen() {

}