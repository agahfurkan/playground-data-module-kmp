package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.User
import com.agah.furkan.playgrounddatamodule.service.UserService

class UserRepository {
    private val userService = UserService()

    suspend fun getUsers(): List<User> {
        return userService.getUsers()
    }
}
