package ru.seversknet.edocompose.ui.viewmodels


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import ru.seversknet.edocompose.data.api.ApiService
import ru.seversknet.edocompose.data.repositories.tasksRepository
import ru.seversknet.edosevadm.api.ApiTasks


class tasksViewModel(private val tasksRepository: tasksRepository, private val apiService: ApiService) : ViewModel() {

    fun getTasksList (){
        viewModelScope.launch {
            tasksRepository.fetchListTasks(apiService)
                .catch { exception -> "Error" }
                .collect(){

                }
        }
    }

    init {
        getTasksList()
    }


}

