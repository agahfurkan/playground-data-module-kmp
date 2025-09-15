package com.agah.furkan.playgrounddatamodule.service

import com.agah.furkan.playgrounddatamodule.model.User
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class UserService {
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
            })
        }
    }

    suspend fun getUsers(): List<User> {
        return listOf(
            User(id = 1, name = "Leanne Graham", email = "Sincere@april.biz"),
            User(id = 2, name = "Ervin Howell", email = "Shanna@melissa.tv"),
            User(id = 3, name = "Clementine Bauch", email = "Nathan@yesenia.net"),
            User(id = 4, name = "Patricia Lebsack", email = "Julianne.OConner@kory.org"),
            User(id = 5, name = "Chelsey Dietrich", email = "Lucio_Hettinger@annie.ca"),
            User(id = 6, name = "Mrs. Dennis Schulist", email = "Karley_Dach@jasper.info"),
            User(id = 7, name = "Kurtis Weissnat", email = "Telly.Hoeger@billy.biz"),
            User(id = 8, name = "Nicholas Runolfsdottir V", email = "Sherwood@rosamond.me"),
            User(id = 9, name = "Glenna Reichert", email = "Chaim_McDermott@dana.io"),
            User(id = 10, name = "Clementina DuBuque", email = "Rey.Padberg@karina.biz")
        )
    }
}
