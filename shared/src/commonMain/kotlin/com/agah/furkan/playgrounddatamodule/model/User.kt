package com.agah.furkan.playgrounddatamodule.model

import kotlinx.serialization.Serializable

@Serializable
data class User(val id: Long, val name: String, val email: String)
