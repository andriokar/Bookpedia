package com.andriokar.bookpedia.book.presentation.book_list

import com.andriokar.bookpedia.book.domain.Book

sealed interface BookListAction {

    data class OnSearchQueryChang(val query: String) : BookListAction

    data class OnBookClick(val book: Book) : BookListAction

    data class OnTabSelected(val index: Int) : BookListAction
}
