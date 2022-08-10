package ru.seversknet.edosevadm.models

data class Tasks(
    val id: String? = null,
    val theme: String? = null,
    val type: String? = null,
    val deadline: String? = null,
    val author: Author? = null,
    val isQuestions: Boolean? = null
)
