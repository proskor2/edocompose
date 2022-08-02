package ru.seversknet.edosevadm.models

data class Signature(
    val id: String,
    val name: String,
    val organization: String,
    val department: String,
    val position: String,
    val photo: String,
    val result: String,
    val date: String,
    val comment: String,
    val elsign: ElSign
)
