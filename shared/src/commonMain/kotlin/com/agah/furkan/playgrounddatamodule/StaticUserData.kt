package com.agah.furkan.playgrounddatamodule

data class KmpUser(
    val userId: Long,
    val username: String,
    val email: String,
    val token: String
)

data class KmpLoginResult(
    val success: Boolean,
    val token: String?,
    val userId: Long?,
    val message: String?
)

data class KmpRegisterResult(
    val success: Boolean,
    val message: String
)

object StaticUserData {

    private val users = mutableListOf(
        KmpUser(
            userId = 1,
            username = "demo_user",
            email = "demo@example.com",
            token = "static_token_demo_user_12345"
        ),
        KmpUser(
            userId = 2,
            username = "test_user",
            email = "test@example.com",
            token = "static_token_test_user_67890"
        ),
        KmpUser(
            userId = 3,
            username = "admin",
            email = "admin@example.com",
            token = "static_token_admin_abcdef"
        )
    )

    fun loginUser(username: String, password: String): KmpLoginResult {
        val user = users.find { it.username == username }

        return if (user != null && password.isNotEmpty()) {
            KmpLoginResult(
                success = true,
                token = user.token,
                userId = user.userId,
                message = "Login successful"
            )
        } else {
            KmpLoginResult(
                success = false,
                token = null,
                userId = null,
                message = "Invalid username or password"
            )
        }
    }

    fun registerUser(username: String, password: String): KmpRegisterResult {
        val existingUser = users.find { it.username == username }

        return if (existingUser != null) {
            KmpRegisterResult(
                success = false,
                message = "Username already exists"
            )
        } else {
            val newUserId = (users.maxOfOrNull { it.userId } ?: 0) + 1
            val newToken = "static_token_${username}_${newUserId}"
            users.add(
                KmpUser(
                    userId = newUserId,
                    username = username,
                    email = "$username@example.com",
                    token = newToken
                )
            )
            KmpRegisterResult(
                success = true,
                message = "Registration successful"
            )
        }
    }

    fun validateToken(token: String): Boolean {
        return users.any { it.token == token }
    }

    fun getUserByToken(token: String): KmpUser? {
        return users.find { it.token == token }
    }

    fun getUserById(userId: Long): KmpUser? {
        return users.find { it.userId == userId }
    }
}

