package com.example.crptocurrencypl.domain.repository

import com.example.crptocurrencypl.data.remote.dto.CoinDetailDto
import com.example.crptocurrencypl.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins() : List<CoinDto>
    suspend fun getCoinById(coinId : String) : CoinDetailDto
}