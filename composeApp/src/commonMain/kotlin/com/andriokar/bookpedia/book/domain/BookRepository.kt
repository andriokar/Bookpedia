package com.andriokar.bookpedia.book.domain

import com.andriokar.bookpedia.core.domain.DataError
import com.andriokar.bookpedia.core.domain.EmptyResult
import com.andriokar.bookpedia.core.domain.Result
import kotlinx.coroutines.flow.Flow

interface BookRepository {

    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>

    suspend fun getBookDescription(bookId: String): Result<String?, DataError>

    fun getFavoriteBooks(): Flow<List<Book>>

    fun isBookFavorite(id: String): Flow<Boolean>

    suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local>

    suspend fun deleteFromFavorites(id: String)
}
