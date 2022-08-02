package ru.seversknet.edosevadm.models

data class UserAuth(
    val id: String,
    val name: String,
    val shortName: String,
    val position: String,
    val photo: String
)
