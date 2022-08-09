package ru.seversknet.edocompose.data.api

import ru.seversknet.edocompose.data.repositories.userRepository

class ApiHelper(val apiService: ApiService) {
    val token = userRepository().createToken("БабенышевВВ", "qhc83p").toString()
    suspend fun getTasks() = apiService.getTasks("Basic "+token, "review")
}