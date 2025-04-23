package com.andriokar.bookpedia

import androidx.compose.runtime.Composable
import com.andriokar.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.andriokar.bookpedia.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    val viewModel = koinViewModel<BookListViewModel>()
    BookListScreenRoot(
        viewModel = viewModel,
        onBookClick = {

        }
    )
}
