package com.andriokar.bookpedia.book.data.network

import com.andriokar.bookpedia.book.data.dto.SearchResponseDto
import com.andriokar.bookpedia.core.domain.DataError
import com.andriokar.bookpedia.core.domain.Result

interface RemoteBookDataSource {

    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>
}
