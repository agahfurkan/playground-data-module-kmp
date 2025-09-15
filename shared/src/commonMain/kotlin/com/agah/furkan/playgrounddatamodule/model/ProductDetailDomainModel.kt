package com.agah.furkan.playgrounddatamodule.model

import com.agah.furkan.playgrounddatamodule.model.response.ProductDetailResponse


data class ProductDetailDomainModel(
    val categoryId: Int,
    val discount: Double,
    val picture: String,
    val price: Double,
    val productDescription: String,
    val productId: Int,
    val productName: String
)

fun ProductDetailResponse.ProductDetail.asDomainModel() =
    ProductDetailDomainModel(
        categoryId = categoryId,
        discount = discount,
        picture = picture,
        price = price,
        productDescription = productDescription,
        productId = productId,
        productName = productName
    )