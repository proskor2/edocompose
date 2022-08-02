package ru.seversknet.edosevadm.models

data class Links(
    val id: String,
    val theme: String,
    val type: String,
    val regNumber: String,
    val regDate: String,
    val sender: Sender
)
