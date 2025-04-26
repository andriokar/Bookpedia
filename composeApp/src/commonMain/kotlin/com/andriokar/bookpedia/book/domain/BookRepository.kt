package com.andriokar.bookpedia.book.domain

import com.andriokar.bookpedia.book.data.dto.BookWorkDto
import com.andriokar.bookpedia.core.domain.DataError
import com.andriokar.bookpedia.core.domain.Result

interface BookRepository {

    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>

    suspend fun getBookDescription(bookId: String): Result<String?, DataError>
}
