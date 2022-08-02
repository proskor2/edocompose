package ru.seversknet.edosevadm.models

data class InformId(
    val id: String,
    val theme: String,
    val type: String,
    val deadline: String,
    val author: Author,
    val isQuestion: Boolean,
    val text: String,
    val history: String,
    val files: List<FilesAll>
)
