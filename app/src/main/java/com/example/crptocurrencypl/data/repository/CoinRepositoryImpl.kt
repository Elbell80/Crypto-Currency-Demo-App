package com.example.crptocurrencypl.data.repository

import com.example.crptocurrencypl.data.remote.CoinPaprikaAPI
import com.example.crptocurrencypl.data.remote.dto.CoinDetailDto
import com.example.crptocurrencypl.data.remote.dto.CoinDto
import com.example.crptocurrencypl.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api : CoinPaprikaAPI
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}