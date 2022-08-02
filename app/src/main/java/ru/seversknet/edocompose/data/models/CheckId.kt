package ru.seversknet.edosevadm.models

data class CheckId(
    val id: String,
    val theme: String,
    val type: String,
    val deadline: String,
    val author: Author,
    val isQuestions: Boolean,
    val history: String,
    val title: String,
    val regNumber: String,
    val regDate: String,
    val resolution: List<Resolution>,
    val links: List<Links>,
    val files: List<FilesAll>
)
