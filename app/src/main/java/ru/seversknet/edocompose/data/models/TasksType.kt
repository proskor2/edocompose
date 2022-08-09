package ru.seversknet.edocompose.data.models

sealed class TasksType(val name: String){
    class taskReview(): TasksType("Review") {
        fun returnName(): String {
            return name
        }
    }
    class taskSign(): TasksType("Sign")
}
