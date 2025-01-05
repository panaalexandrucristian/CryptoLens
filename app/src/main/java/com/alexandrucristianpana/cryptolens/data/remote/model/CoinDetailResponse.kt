package com.alexandrucristianpana.cryptolens.data.remote.model

import com.google.gson.annotations.SerializedName

data class CoinDetailResponse(
    val id: String,
    val symbol: String,
    val name: String,
    val description: Map<String, String>,
    val image: ImageUrls,
    @SerializedName("market_cap_rank")
    val marketCapRank: Int?,
    @SerializedName("market_data")
    val marketData: MarketData,
    val links: Links
)

data class ImageUrls(
    val thumb: String,
    val small: String,
    val large: String
)

data class MarketData(
    @SerializedName("current_price")
    val currentPrice: Map<String, Double>,
    @SerializedName("market_cap")
    val marketCap: Map<String, Double>,
    @SerializedName("total_volume")
    val totalVolume: Map<String, Double>,
    @SerializedName("price_change_percentage_24h")
    val priceChangePercentage24h: Double,
    @SerializedName("price_change_percentage_7d")
    val priceChangePercentage7d: Double,
    @SerializedName("price_change_percentage_30d")
    val priceChangePercentage30d: Double,
    @SerializedName("circulating_supply")
    val circulatingSupply: Double?,
    @SerializedName("total_supply")
    val totalSupply: Double?,
    @SerializedName("max_supply")
    val maxSupply: Double?,
    @SerializedName("sparkline_7d")
    val sparkline7d: Sparkline?
)

data class Sparkline(
    val price: List<Double>?
)

data class Links(
    val homepage: List<String>,
    @SerializedName("blockchain_site")
    val blockchainSite: List<String>,
    @SerializedName("official_forum_url")
    val officialForumUrl: List<String>,
    @SerializedName("twitter_screen_name")
    val twitterScreenName: String?,
    @SerializedName("telegram_channel_identifier")
    val telegramChannelIdentifier: String?,
    @SerializedName("subreddit_url")
    val subredditUrl: String?
)