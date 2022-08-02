package ru.seversknet.edosevadm.models

data class UserBirthday(
    val id: String,
    val name: String,
    val shortName: String,
    val position: String,
    val photo: String,
    val human: Human
)
