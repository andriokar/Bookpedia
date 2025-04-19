package com.andriokar.bookpedia

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.andriokar.bookpedia.book.presentation.book_list.BookListScreen
import com.andriokar.bookpedia.book.presentation.book_list.BookListState
import com.andriokar.bookpedia.book.presentation.book_list.books

@Preview
@Composable
private fun BookListScreenPreview() {
    MaterialTheme {
        BookListScreen(
            state = BookListState(
                searchResults = books
            ),
            onAction = {}
        )
    }
}
