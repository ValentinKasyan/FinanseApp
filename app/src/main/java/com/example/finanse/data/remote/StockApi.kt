package com.example.finanse.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    //to download CSV file physical currency list
    //https://www.alphavantage.co/physical_currency_list&apikey=FVC0EPTFICGETGHE&datatype=csv
    @GET("query?function=physical_currency_list")
    suspend fun getPhysicalCurrencyList(
        @Query("apiKey") apiKey: String = API_KEY
    ): ResponseBody

    companion object {
        const val API_KEY = "FVC0EPTFICGETGHE"
        const val BASE_URL = "https://www.alphavantage.co"
    }
}