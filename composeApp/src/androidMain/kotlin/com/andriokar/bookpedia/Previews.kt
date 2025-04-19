package com.andriokar.bookpedia

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.andriokar.bookpedia.book.domain.Book
import com.andriokar.bookpedia.book.presentation.book_list.components.BookListItem
import com.andriokar.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview(showBackground = true)
@Composable
private fun BookSearchBarPreviewWithText() {
    MaterialTheme {
        BookSearchBar(
            searchQuery = "Kotlin",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BookSearchBarPreviewWithoutText() {
    MaterialTheme {
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BookListItemPreviewWithTwoAuthors() {
    MaterialTheme {
        BookListItem(
            book = Book(
                id = "OL19541946W",
                title = "Kotlin in Action",
                imageUrl = "https://covers.openlibrary.org/b/id/14825770-L.jpg",
                authors = listOf("Dmitry Jemerov", "Svetlana Isakova"),
                description = "Kotlin in Action guides experienced Java developers from the language basics of Kotlin all the way through building applications to run on the JVM and Android devices.",
                languages = listOf("en"),
                firstPublishYear = "2017",
                averageRating = 4.5,
                ratingCount = 2,
                numPages = 360,
                numEditions = 1,
            ),
            onClick = {},
            modifier = Modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BookListItemPreviewWithMultipleAuthors() {
    MaterialTheme {
        BookListItem(
            book = Book(
                id = "OL6030812W",
                title = "Design patterns",
                imageUrl = "https://ia800606.us.archive.org/view_archive.php?archive=/22/items/olcovers660/olcovers660-L.zip&file=6601119-L.jpg",
                authors = listOf("Erich Gamma", "John Vlissides", "Richard Helm", "Ralph Johnson"),
                description = "Four software designers present a catalog of simple and succinct solutions to commonly occurring design problems, using Smalltalk and C++ in example code. These 23 patterns allow designers to create more flexible, elegant, and ultimately reusable designs without having to rediscover the design solutions themselves. The authors begin by describing what patterns are and how they can help you design object-oriented software. They go on to systematically name, explain, evaluate, and catalog recurring designs in object-oriented systems.",
                languages = listOf("en"),
                firstPublishYear = "1995",
                averageRating = 3.9,
                ratingCount = 29,
                numPages = 395,
                numEditions = 1,
            ),
            onClick = {},
            modifier = Modifier
        )
    }
}
