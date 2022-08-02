package ru.seversknet.edosevadm.models

data class UserDetail(
    val id: String,
    val name: String,
    val shortName: String,
    val position: String,
    val photo: String,
    val organization: String,
    val department: String,
    val phones: Array<String>,
    val emails: Array<String>,
    val location: String,
    val hireDate: String?,
    val fireDate: String?,
    val human: Human
)
