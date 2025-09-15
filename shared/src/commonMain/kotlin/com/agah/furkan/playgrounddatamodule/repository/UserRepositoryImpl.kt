package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.request.UserLoginBody
import com.agah.furkan.playgrounddatamodule.model.request.UserRegisterBody
import com.agah.furkan.playgrounddatamodule.model.request.ValidateTokenBody
import com.agah.furkan.playgrounddatamodule.model.response.UserLoginResponse

class UserRepositoryImpl() : UserRepository {

    override suspend fun loginUser(userLoginBody: UserLoginBody): Result<UserLoginResponse> =
        Result.success(
            UserLoginResponse(token = "fake_token", userId = 1L)
        )

    override suspend fun registerNewUser(userRegisterBody: UserRegisterBody): Result<String> =
        Result.success("User registered successfully")

    override suspend fun validateToken(validateTokenBody: ValidateTokenBody): Result<String> =
        Result.success("Token validated successfully")
}
