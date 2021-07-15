package com.wahidabd.movieapps.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideApi(): Retrofit = Retrofit.Builder()
        .baseUrl("URL")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}