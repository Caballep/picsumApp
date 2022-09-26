package com.example.picsumapp.di

import com.example.picsumapp.data.source.remote.PicsumAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class PicsumModule {

    @Provides
    @Singleton
    fun providePicsumAPI(): PicsumAPI {
        return Retrofit.Builder()
            .baseUrl(PicsumAPI.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PicsumAPI::class.java)
    }
}