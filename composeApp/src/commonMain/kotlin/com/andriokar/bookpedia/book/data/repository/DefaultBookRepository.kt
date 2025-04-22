package com.andriokar.bookpedia.book.data.repository

import com.andriokar.bookpedia.book.data.mappers.toBook
import com.andriokar.bookpedia.book.data.network.RemoteBookDataSource
import com.andriokar.bookpedia.book.domain.Book
import com.andriokar.bookpedia.book.domain.BookRepository
import com.andriokar.bookpedia.core.domain.DataError
import com.andriokar.bookpedia.core.domain.Result
import com.andriokar.bookpedia.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
): BookRepository {

    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}
