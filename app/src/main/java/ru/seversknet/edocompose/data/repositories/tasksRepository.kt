package ru.seversknet.edocompose.data.repositories


import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ru.seversknet.edocompose.data.api.ApiHelper
import ru.seversknet.edocompose.data.api.ApiService
import ru.seversknet.edosevadm.api.ApiTasks
import ru.seversknet.edosevadm.models.Tasks


class tasksRepository() {

    suspend fun fetchListTasks(apiService: ApiService): Flow<List<Tasks>> {
        val listTasks : Flow<List<Tasks>> = flow {
          val listTasks = ApiHelper(apiService).getTasks()
            emit(listTasks)
        }
        return listTasks
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
