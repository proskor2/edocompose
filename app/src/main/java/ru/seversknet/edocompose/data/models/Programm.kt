package ru.seversknet.edosevadm.models

data class Programm(
    val id: String,
    val title: String,
    val type: String,
    val regDate: String,
    val regNumber: String,
    val files: List<FilesAll>
)
