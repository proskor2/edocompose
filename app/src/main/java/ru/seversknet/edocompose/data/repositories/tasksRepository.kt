package ru.seversknet.edocompose.data.repositories


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import ru.seversknet.edocompose.data.api.ApiService
import ru.seversknet.edocompose.data.api.TasksApiState
import ru.seversknet.edosevadm.models.Tasks


class tasksRepository(private val apiService: ApiService) {

    suspend fun getListTasks(token: String, type: String): Flow<TasksApiState<Tasks>> {
        return flow {
            val task = apiService.getTasks(token, type)
            emit(TasksApiState.success(task))
        }.flowOn(Dispatchers.IO)
    }

    fun reviewTask(idTask: String){

    }

    fun delegateTask(){

    }

    fun agreeTask(){

    }

    fun signTask(){

    }

    fun infromTask(){

    }

    fun performTask(){

    }

    fun sendToReview(){

    }
}
