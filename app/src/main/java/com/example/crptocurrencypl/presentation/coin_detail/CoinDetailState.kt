package com.example.crptocurrencypl.presentation.coin_detail

import com.example.crptocurrencypl.domain.model.Coin
import com.example.crptocurrencypl.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    var error: String = ""
)
