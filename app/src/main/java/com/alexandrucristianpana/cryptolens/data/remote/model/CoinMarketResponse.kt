package com.alexandrucristianpana.cryptolens.data.remote.model

import com.google.gson.annotations.SerializedName

data class CoinMarketResponse(
    val id: String,
    val symbol: String,
    val name: String,
    val image: String,
    @SerializedName("current_price")
    val currentPrice: Double,
    @SerializedName("market_cap")
    val marketCap: Long,
    @SerializedName("market_cap_rank")
    val marketCapRank: Int,
    @SerializedName("price_change_percentage_24h")
    val priceChangePercentage24h: Double,
    @SerializedName("price_change_percentage_7d_in_currency")
    val priceChangePercentage7d: Double?,
    @SerializedName("price_change_percentage_30d_in_currency")
    val priceChangePercentage30d: Double?,
    @SerializedName("total_volume")
    val totalVolume: Double,
    @SerializedName("high_24h")
    val high24h: Double?,
    @SerializedName("low_24h")
    val low24h: Double?,
    @SerializedName("circulating_supply")
    val circulatingSupply: Double?,
    @SerializedName("total_supply")
    val totalSupply: Double?,
    @SerializedName("max_supply")
    val maxSupply: Double?,
    @SerializedName("sparkline_in_7d")
    val sparklineIn7d: SparklineIn7d?
)

data class SparklineIn7d(
    val price: List<Double>
)