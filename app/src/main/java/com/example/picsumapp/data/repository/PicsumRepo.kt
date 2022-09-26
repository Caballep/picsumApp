package com.example.picsumapp.data.repository

import com.example.picsumapp.core.DataState
import com.example.picsumapp.domain.model.AuthorImage
import kotlinx.coroutines.flow.Flow

interface PicsumRepo {
    fun getAuthorImages(page: Int): Flow<DataState<List<AuthorImage>>>
}