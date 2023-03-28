package com.example.finanse.domain.repository

import com.example.finanse.data.remote.dto.CoinDetailDto
import com.example.finanse.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}