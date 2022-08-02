package ru.seversknet.edosevadm.models

data class Tasks(
    val id: String,
    val theme: String,
    val type: String,
    val deadline: String,
    val author: Author,
    val isQuestions: Boolean
)
