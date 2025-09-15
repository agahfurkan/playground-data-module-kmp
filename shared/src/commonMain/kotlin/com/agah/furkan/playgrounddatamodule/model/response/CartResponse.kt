package com.agah.furkan.playgrounddatamodule.model.response

data class CartResponse(
    val cartList: List<Cart>
) {
    data class Cart(
        val cartId: Long,
        val discount: Double,
        val picture: String,
        val price: Double,
        val productDescription: String,
        val productId: Long,
        val productName: String
    )
}