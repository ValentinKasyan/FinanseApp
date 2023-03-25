package com.example.finanse.data.remote

import com.example.finanse.data.remote.dto.CoinDto
import retrofit2.http.GET

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins():List<CoinDto>
    // TODO: add /v1/coins/{coinId}  22.40 

}