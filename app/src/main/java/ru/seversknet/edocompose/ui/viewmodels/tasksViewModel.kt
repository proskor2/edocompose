package ru.seversknet.edocompose.ui.viewmodels


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import ru.seversknet.edocompose.data.api.ApiService
import ru.seversknet.edocompose.data.api.Status
import ru.seversknet.edocompose.data.api.TasksApiState
import ru.seversknet.edocompose.data.models.TasksType
import ru.seversknet.edocompose.data.repositories.tasksRepository
import ru.seversknet.edocompose.data.repositories.userRepository
import ru.seversknet.edosevadm.api.ApiTasks
import ru.seversknet.edosevadm.models.Tasks


class tasksViewModel() : ViewModel() {

    private val repository = tasksRepository(ApiService.AppConfig.ApiService())

    val taskState = MutableStateFlow(TasksApiState(Status.LOADING, listOf<Tasks>(), ""))

    val token = userRepository().createToken("БабенышевВВ", "qhc83p")

    init {
        getTasksList("Basic $token", "review")
    }

    fun getTasksList (token: String, type: String){
        taskState.value = TasksApiState.loading()

        viewModelScope.launch {
            repository.getListTasks(token, type)
                .catch {
                    taskState.value = TasksApiState.error(it.message.toString())
                }
                .collect{
                    taskState.value = TasksApiState.success(it.data)
                }
        }

    }

}

