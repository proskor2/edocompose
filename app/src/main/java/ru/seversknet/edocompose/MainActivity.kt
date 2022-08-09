package ru.seversknet.edocompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewModelScope
import ru.seversknet.edocompose.data.api.ApiService
import ru.seversknet.edocompose.data.api.BaseURL
import ru.seversknet.edocompose.data.models.TasksType
import ru.seversknet.edocompose.data.repositories.tasksRepository
import ru.seversknet.edocompose.ui.screens.MainScreen
import ru.seversknet.edocompose.ui.viewmodels.tasksViewModel
import ru.seversknet.edosevadm.api.ApiTasks

class MainActivity : ComponentActivity() {
    private var viewModel: tasksViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel?.getTasksList()
        setContent {
            MainScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}

