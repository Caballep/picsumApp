package com.example.picsumapp.domain.model.error

class UnexpectedError

sealed class DomainErrors {
    class HttpError(code: Int? = null)
    object Unknown
}