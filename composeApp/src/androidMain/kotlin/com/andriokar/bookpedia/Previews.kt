package com.andriokar.bookpedia

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.andriokar.bookpedia.book.domain.Book
import com.andriokar.bookpedia.book.presentation.book_list.BookListScreen
import com.andriokar.bookpedia.book.presentation.book_list.BookListState

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

private val books = listOf(
    Book(
        id = "1",
        title = "Book with no cover",
        imageUrl = "https://test.test",
        authors = listOf(
            "John Doe",
            "John Smith"
        ),
        description = null,
        languages = listOf("en"),
        firstPublishYear = "2027",
        averageRating = 5.0,
        ratingCount = 1,
        numPages = 648,
        numEditions = 1,
    ),
    Book(
        id = "OL19543763W",
        title = "Cloud Native Java",
        imageUrl = "https://covers.openlibrary.org/b/id/8510267-L.jpg",
        authors = listOf(
            "Josh Long",
            "Kenny Bastani"
        ),
        description = null,
        languages = listOf("en"),
        firstPublishYear = "2017",
        averageRating = 3.0,
        ratingCount = 1,
        numPages = 648,
        numEditions = 1,
    ),
    Book(
        id = "OL23170657M",
        title = "Introduction to Algorithms",
        imageUrl = "https://ia804605.us.archive.org/view_archive.php?archive=/14/items/l_covers_0011/l_covers_0011_10.zip&file=0011106524-L.jpg",
        authors = listOf(
            "Thomas H. Cormen",
            "Charles E. Leiserson",
            "Ronald L. Rivest",
            "Clifford Stein"
        ),
        description = null,
        languages = listOf("en"),
        firstPublishYear = "2009",
        averageRating = 4.0,
        ratingCount = 19,
        numPages = 1292,
        numEditions = 3,
    ),
    Book(
        id = "OL19541946W",
        title = "Kotlin in Action",
        imageUrl = "https://covers.openlibrary.org/b/id/14825770-L.jpg",
        authors = listOf(
            "Dmitry Jemerov",
            "Svetlana Isakova"
        ),
        description = "Kotlin in Action guides experienced Java developers from the language basics of Kotlin all the way through building applications to run on the JVM and Android devices.",
        languages = listOf("en"),
        firstPublishYear = "2017",
        averageRating = 4.5,
        ratingCount = 2,
        numPages = 360,
        numEditions = 1,
    ),
    Book(
        id = "OL6030812W",
        title = "Design patterns",
        imageUrl = "https://ia800606.us.archive.org/view_archive.php?archive=/22/items/olcovers660/olcovers660-L.zip&file=6601119-L.jpg",
        authors = listOf(
            "Erich Gamma",
            "John Vlissides",
            "Richard Helm",
            "Ralph Johnson"
        ),
        description = "Four software designers present a catalog of simple and succinct solutions to commonly occurring design problems, using Smalltalk and C++ in example code. These 23 patterns allow designers to create more flexible, elegant, and ultimately reusable designs without having to rediscover the design solutions themselves. The authors begin by describing what patterns are and how they can help you design object-oriented software. They go on to systematically name, explain, evaluate, and catalog recurring designs in object-oriented systems.",
        languages = listOf("en"),
        firstPublishYear = "1995",
        averageRating = 3.9,
        ratingCount = 29,
        numPages = 395,
        numEditions = 1,
    ),
    Book(
        id = "OL6223299W",
        title = "Effective Java",
        imageUrl = "https://covers.openlibrary.org/b/id/7429009-L.jpg",
        authors = listOf("Joshua Bloch"),
        description = null,
        languages = listOf("en"),
        firstPublishYear = "2001",
        averageRating = 4.5,
        ratingCount = 6,
        numPages = 346,
        numEditions = 2,
    ),
    Book(
        id = "OL16942701W",
        title = "Head First Design Patterns",
        imageUrl = "https://ia601909.us.archive.org/view_archive.php?archive=/31/items/l_covers_0013/l_covers_0013_34.zip&file=0013345163-L.jpg",
        authors = listOf(
            "Eric Freeman",
            "Elisabeth Freeman",
            "Kathy Sierra",
            "Bert Bates",
            "Elisabeth Robson"
        ),
        description = null,
        languages = listOf("en", "fr"),
        firstPublishYear = "2021",
        averageRating = 4.3,
        ratingCount = 12,
        numPages = 694,
        numEditions = 2,
    ),
    Book(
        id = "OL26833108M",
        title = "Spring in Action",
        imageUrl = "https://ia802309.us.archive.org/view_archive.php?archive=/20/items/l_covers_0008/l_covers_0008_50.zip&file=0008508406-L.jpg",
        authors = listOf(
            "Craig Walls",
            "Ryan Breidenbach"
        ),
        description = null,
        languages = listOf("en"),
        firstPublishYear = "2018",
        averageRating = 4.0,
        ratingCount = 2,
        numPages = 520,
        numEditions = 5,
    )
)

