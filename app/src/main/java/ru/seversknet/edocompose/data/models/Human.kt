package ru.seversknet.edosevadm.models

data class Human(
    val id: String,
    val gender: String,
    val birthday: String,
    val emails: Array<String>,
    val phones: Array<String>,
    val address: String
)
