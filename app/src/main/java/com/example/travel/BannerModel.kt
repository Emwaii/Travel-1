package com.example.travel

data class BannerModel(
    val id: Int,
    val name: String,
    val imageUrl: String
)

val bannerList = listOf(
    BannerModel(1, "Banner 1", "drawable-v24/jk.png"),
    BannerModel(2, "Banner 2", "drawable-v24/jk2.png")
)
