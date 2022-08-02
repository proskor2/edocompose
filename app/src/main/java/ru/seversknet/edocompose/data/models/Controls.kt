package ru.seversknet.edosevadm.models

data class Controls(
    val id: String,
    val theme: String,
    val deadline: String,
    val controlled: Author,
    val document: Docs
)
