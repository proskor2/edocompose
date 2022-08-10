package ru.seversknet.edocompose.data.api

import ru.seversknet.edosevadm.models.Tasks

data class TasksApiState <T>(val status: Status, val data: List<T>, val message: String?){

    companion object {

        //In case of Success,set status as Success and data as the response
        fun <T> success(data: List<T>): TasksApiState<T> {
            return TasksApiState(Status.SUCCESS, data, null)
        }

        //In case of failure ,set state to Error ,add the error message,set data to null
        fun <T>  error(msg: String): TasksApiState<T>  {
            return TasksApiState(Status.ERROR, emptyList(), msg)
        }

        //When the call is loading set the state as Loading and rest as null
        fun <T> loading(): TasksApiState<T>  {
            return TasksApiState(Status.LOADING, emptyList(), null)
        }

    }
}

//An enum to store the current state of api call
enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}