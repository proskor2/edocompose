package ru.seversknet.edosevadm.models

data class EventId(
    val id: String,
    val title: String,
    val type: String,
    val place: String,
    val sponsor: String,
    val dateBegin: String,
    val dateEnd: String,
    val description: String,
    val vulture: String,
    val importance: String,
    val participants: List<Participants>,
    val programm: List<Programm>,
    val files: List<FilesAll>
)
