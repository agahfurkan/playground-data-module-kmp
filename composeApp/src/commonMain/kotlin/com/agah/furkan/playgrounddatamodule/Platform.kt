package com.agah.furkan.playgrounddatamodule

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform