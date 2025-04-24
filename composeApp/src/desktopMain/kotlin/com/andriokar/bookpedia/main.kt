package com.andriokar.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.andriokar.bookpedia.app.App
import com.andriokar.bookpedia.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-Bookpedia",
        ) {
            App()
        }
    }
}
