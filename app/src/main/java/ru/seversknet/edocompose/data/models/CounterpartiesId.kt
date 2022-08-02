package ru.seversknet.edosevadm.models

data class CounterpartiesId(
    val id: String,
    val name: String,
    val fullname: String,
    val inn: String,
    val kpp: String,
    val ogrn: String,
    val type: String,
    val email: String,
    val phone: String,
    val site: String,
    val addressReg: String,
    val addressFact: String,
    val addressMail: String,
    val contacts: Array<Contacts>
)

