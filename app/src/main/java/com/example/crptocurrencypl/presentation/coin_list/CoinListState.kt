package com.example.crptocurrencypl.presentation.coin_list

import com.example.crptocurrencypl.domain.model.Coin

data class CoinListState(
    val isLoading :Boolean = false,
    val coins : List<Coin> = emptyList(),
    var error : String = ""
)
