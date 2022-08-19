package ru.seversknet.edocompose.data.api

import ru.seversknet.edosevadm.models.Tasks

data class TasksApiState<T>(val status: Status, val data: List<T>, val message: String?) {
    companion object {
        fun <T> success(data: List<T>): TasksApiState<T> {
            return TasksApiState(Status.SUCCESS, data, null)
        }

        fun <T> error(msg: String): TasksApiState<T> {
            return TasksApiState(Status.ERROR, emptyList(), msg)
        }

        fun <T> loading(): TasksApiState<T> {
            return TasksApiState(Status.LOADING, emptyList(), null)
        }
    }
}

enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}