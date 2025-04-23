package com.andriokar.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import com.andriokar.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}
