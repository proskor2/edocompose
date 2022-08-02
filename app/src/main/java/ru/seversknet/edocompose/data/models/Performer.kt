package ru.seversknet.edosevadm.models

data class Performer(
    val id: String,
    val name: String,
    val shortName: String,
    val organization: String,
    val department: String,
    val position: String,
    val photo: String,
    val responsible: Boolean
)
