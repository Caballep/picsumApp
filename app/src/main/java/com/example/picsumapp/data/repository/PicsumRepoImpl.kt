package com.example.picsumapp.data.repository

import com.example.picsumapp.core.DataState
import com.example.picsumapp.data.source.remote.PicsumAPI
import com.example.picsumapp.domain.model.AuthorImage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception

class PicsumRepoImpl(
    private val picsumAPI: PicsumAPI
) : PicsumRepo {
    override fun getAuthorImages(page: Int): Flow<DataState<List<AuthorImage>>> = flow {
        emit(DataState.Loading())
        try {
            val authorImageList = picsumAPI.getWordInfo(page = page, limit = 20).map {
                AuthorImage(
                    author = it.author,
                    imageUrl = it.url
                )
            }
            emit(DataState.Success(authorImageList))
        } catch (e: Exception) {
            emit(DataState.Error())
        }
    }
}