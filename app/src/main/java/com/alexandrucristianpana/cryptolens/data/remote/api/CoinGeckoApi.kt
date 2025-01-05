package com.alexandrucristianpana.cryptolens.data.remote.api

import com.alexandrucristianpana.cryptolens.data.remote.model.CoinDetailResponse
import com.alexandrucristianpana.cryptolens.data.remote.model.CoinMarketResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CoinGeckoApi {
    @GET("coins/markets")
    suspend fun getCoins(
        @Query("vs_currency") currency: String = "usd",
        @Query("order") order: String = "market_cap_desc",
        @Query("per_page") perPage: Int = 100,
        @Query("page") page: Int = 1,
        @Query("sparkline") sparkline: Boolean = true,
        @Query("price_change_percentage") priceChangePercentage: String = "24h,7d,30d"
    ): List<CoinMarketResponse>

    @GET("coins/{id}")
    suspend fun getCoinById(
        @Path("id") id: String,
        @Query("localization") localization: Boolean = false,
        @Query("tickers") tickers: Boolean = false,
        @Query("market_data") marketData: Boolean = true,
        @Query("community_data") communityData: Boolean = false,
        @Query("developer_data") developerData: Boolean = false,
        @Query("sparkline") sparkline: Boolean = true
    ): CoinDetailResponse

    @GET("coins/{id}/market_chart")
    suspend fun getCoinMarketChart(
        @Path("id") id: String,
        @Query("vs_currency") currency: String = "usd",
        @Query("days") days: String
    ): MarketChartResponse
}
