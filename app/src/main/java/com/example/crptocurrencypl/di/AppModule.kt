package com.example.crptocurrencypl.di

import com.example.crptocurrencypl.common.Constants
import com.example.crptocurrencypl.data.remote.CoinPaprikaAPI
import com.example.crptocurrencypl.data.repository.CoinRepositoryImpl
import com.example.crptocurrencypl.domain.repository.CoinRepository
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

    @Provides
    @Singleton
    fun providesPaprikaApi(): CoinPaprikaAPI{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaAPI::class.java)
    }

    @Provides
    @Singleton
    fun providesCoinRepository(api : CoinPaprikaAPI) : CoinRepository{
        return CoinRepositoryImpl(api)
    }
}