package ru.seversknet.edocompose.data.repositories

import android.util.Base64

class userRepository {

// function for create new token
    fun createToken(login: String, pass: String): String? {
        val newString = "$login:$pass"
        val data = newString.toByteArray()
        val base64String = Base64.encodeToString(data, Base64.NO_WRAP)
        return base64String
    }
}