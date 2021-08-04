package com.wahidabd.movieapps.di

import com.wahidabd.movieapps.data.network.MovieApi
import com.wahidabd.movieapps.data.repository.MovieRepository
import com.wahidabd.movieapps.data.source.MovieDataSource
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
    fun provideRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("URL")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun provideApi(retrofit: Retrofit): MovieApi =
        retrofit.create(MovieApi::class.java)

    @Singleton
    @Provides
    fun provideMovieDataSource(api: MovieApi) = MovieDataSource(api)

    @Singleton
    @Provides
    fun provideMovieRepository(movieDataSource: MovieDataSource) = MovieRepository(movieDataSource)
}