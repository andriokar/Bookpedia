package com.andriokar.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform