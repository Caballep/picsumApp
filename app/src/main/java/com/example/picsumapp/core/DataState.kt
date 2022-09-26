package com.example.picsumapp.core

sealed class DataState<T>(val data: T? = null) {
    class Loading<T>(data: T? = null): DataState<T>(data)
    class Success<T>(data: T?): DataState<T>(data)
    class Error<T>(data: T? = null): DataState<T>(data)
}


sealed class ResultOf<out T> {
    data class Success<out R>(val value: R): ResultOf<R>()
    data class Failure(
        val message: String?,
        val throwable: Throwable?
    ): ResultOf<Nothing>()
    object Loading
}