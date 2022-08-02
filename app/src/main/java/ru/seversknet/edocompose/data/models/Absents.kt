package ru.seversknet.edosevadm.models

data class Absents(
    val id: String,
    val name: String,
    val dateBegin: String,
    val dateEnd: String,
    val reason: String,
    val comment: String,
    val replace: String,
    val delegate: Boolean
)
