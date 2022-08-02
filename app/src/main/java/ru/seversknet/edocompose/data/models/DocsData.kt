package ru.seversknet.edosevadm.mainscreen.base

import ru.seversknet.edosevadm.models.*

data class DocsData (
    val id: String?,
    val idTask: String?,
    val isCheckTask: Boolean,
    val subTasksExists: Boolean,
    val type: String?,
    val typeName: String?,
    val theme: String?,
    val registration: String?,
    val deadline: String?,
    val senders: Array<Sender>?,
    val author: Author?,
    val resolutions: Array<Resolution>?,
    val signature: Array<Signature>?,
    val files: Array<FilesAll>?,
    val links: List<Links>,
    val HistoryСomments: String
)
