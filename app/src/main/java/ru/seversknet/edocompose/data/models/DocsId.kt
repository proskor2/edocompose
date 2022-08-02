package ru.seversknet.edosevadm.models

data class DocsId(
    val id: String,
    val theme: String,
    val type: String,
    val regNumber: String,
    val regDate: String,
    val sender: Sender,
    val files: List<FilesAll>,
    val links: List<Links>
)
