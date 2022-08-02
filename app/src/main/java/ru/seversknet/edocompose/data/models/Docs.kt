package ru.seversknet.edosevadm.models

data class Docs(
    val id: String,
    val theme: String,
    val type: String,
    val regNumber: String,
    val regDate: String,
    val sender: Sender
)