package com.agah.furkan.playgrounddatamodule.model.response

data class ProductResponse(
    val productList: List<Product>
) {
    data class Product(
        val categoryId: Long,
        val discount: Double,
        val picture: String,
        val price: Double,
        val productDescription: String,
        val productId: Long,
        val productName: String
    )
}
