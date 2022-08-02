package ru.seversknet.edosevadm.models

data class UserEmployees(
    val id: String,
    val name: String,
    val shortName: String,
    val position: String,
    val photo: String?,
    val organization: String,
    val department: String,
    val isFavorite: Boolean
)
