package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.request.UserLoginBody
import com.agah.furkan.playgrounddatamodule.model.request.UserRegisterBody
import com.agah.furkan.playgrounddatamodule.model.request.ValidateTokenBody
import com.agah.furkan.playgrounddatamodule.model.response.UserLoginResponse


interface UserRepository {
    suspend fun loginUser(userLoginBody: UserLoginBody): Result<UserLoginResponse>
    suspend fun registerNewUser(userRegisterBody: UserRegisterBody): Result<String>
    suspend fun validateToken(validateTokenBody: ValidateTokenBody): Result<String>
}
