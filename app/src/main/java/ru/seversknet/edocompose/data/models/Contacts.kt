package ru.seversknet.edosevadm.models

data class Contacts(
    val name: String,
    val position: String,
    val department: String,
    val phone: Array<String>,
    val email: Array<String>
)