package com.agah.furkan.playgrounddatamodule.model.response

data class ProductDetailResponse(
    val productDetail: ProductDetail
) {
    data class ProductDetail(
        val categoryId: Int,
        val discount: Double,
        val picture: String,
        val price: Double,
        val productDescription: String,
        val productId: Int,
        val productName: String
    )
}
