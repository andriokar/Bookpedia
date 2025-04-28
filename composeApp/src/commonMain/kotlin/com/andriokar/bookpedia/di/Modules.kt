package com.andriokar.bookpedia.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.andriokar.bookpedia.book.data.database.DatabaseFactory
import com.andriokar.bookpedia.book.data.database.FavoriteBookDatabase
import com.andriokar.bookpedia.book.data.network.KtorRemoteBookDataSource
import com.andriokar.bookpedia.book.data.network.RemoteBookDataSource
import com.andriokar.bookpedia.book.data.repository.DefaultBookRepository
import com.andriokar.bookpedia.book.domain.BookRepository
import com.andriokar.bookpedia.book.presentation.SelectedBookViewModel
import com.andriokar.bookpedia.book.presentation.book_detail.BookDetailViewModel
import com.andriokar.bookpedia.book.presentation.book_list.BookListViewModel
import com.andriokar.bookpedia.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
        get<DatabaseFactory>()
            .create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }
    single { get<FavoriteBookDatabase>().favoriteBookDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}
