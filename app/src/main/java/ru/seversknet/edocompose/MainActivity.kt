package ru.seversknet.edocompose


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import ru.seversknet.edocompose.data.api.ApiService
import ru.seversknet.edocompose.data.api.BaseURL
import ru.seversknet.edocompose.data.api.Status
import ru.seversknet.edocompose.data.models.TasksType
import ru.seversknet.edocompose.data.repositories.tasksRepository
import ru.seversknet.edocompose.data.repositories.userRepository
import ru.seversknet.edocompose.ui.screens.MainScreen
import ru.seversknet.edocompose.ui.screens.listscreen
import ru.seversknet.edocompose.ui.viewmodels.tasksViewModel
import ru.seversknet.edosevadm.api.ApiTasks
import ru.seversknet.edosevadm.models.Tasks

class MainActivity : ComponentActivity() {
    private lateinit var viewModel: tasksViewModel
    var mainlist: MutableList<Tasks>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val token = userRepository().createToken("БабенышевВВ", "qhc83p")
        viewModel = ViewModelProvider(this).get(tasksViewModel::class.java)
        viewModel.getTasksList("Basic $token", "review")


      lifecycleScope.launch{
            viewModel.taskState.collect{
                when (it.status) {
                    Status.LOADING -> ""
                    Status.ERROR -> {
                        Log.e("COR", "${it.message}")
                    }
                    Status.SUCCESS -> {
                        it.data.let{ tasks ->
                            for (task in tasks){
                                mainlist?.add(task)
                            }
                        }
                    }
                }
            }
        }
        setContent {

        }


    }

    override fun onResume() {
        super.onResume()


    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}

