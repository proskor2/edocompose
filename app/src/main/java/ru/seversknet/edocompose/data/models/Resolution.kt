package ru.seversknet.edosevadm.models

data class Resolution(
    val id: String,
    val author: String,
    val deadline: String,
    val text: String,
    val project: Boolean,
    val performers: Array<Performer>
)
