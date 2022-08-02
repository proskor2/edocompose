package ru.seversknet.edosevadm.models

data class Sender(
    val id: String,
    val type: String,
    val organization: String,
    val department: String,
    val position: String,
    val person: String
)