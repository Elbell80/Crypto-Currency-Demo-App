package com.example.crptocurrencypl.data.remote

import com.example.crptocurrencypl.data.remote.dto.CoinDetailDto
import com.example.crptocurrencypl.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaAPI {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}