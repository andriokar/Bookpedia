package com.andriokar.bookpedia

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.andriokar.bookpedia.book.data.network.KtorRemoteBookDataSource
import com.andriokar.bookpedia.book.data.repository.DefaultBookRepository
import com.andriokar.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.andriokar.bookpedia.book.presentation.book_list.BookListViewModel
import com.andriokar.bookpedia.core.data.HttpClientFactory
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(engine: HttpClientEngine) {
    BookListScreenRoot(
        viewModel = remember {
            BookListViewModel(
                bookRepository = DefaultBookRepository(
                    remoteBookDataSource = KtorRemoteBookDataSource(
                        HttpClientFactory.create(engine)
                    )
                )
            )
        },
        onBookClick = {

        }
    )
}
