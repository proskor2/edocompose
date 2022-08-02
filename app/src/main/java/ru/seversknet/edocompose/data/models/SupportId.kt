package ru.seversknet.edosevadm.mainscreen.support

import ru.seversknet.edosevadm.models.FilesAll

data class SupportId(
    val id: String,
    val dateBegin: String,
    val theme: String,
    val description: String,
    val dateEnd: String,
    val performer: String,
    val answer: String,
    val files: Array<FilesAll>
)
