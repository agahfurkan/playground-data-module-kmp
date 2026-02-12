package com.agah.furkan.playgrounddatamodule

data class KmpCart(
    val cartId: Long,
    val discount: Double,
    val picture: String,
    val price: Double,
    val productDescription: String,
    val productId: Long,
    val productName: String,
    val quantity: Int = 1
)

object StaticCartData {

    private val cartItems = mutableMapOf<Long, MutableList<KmpCart>>()

    fun getCartForUser(userId: Long): List<KmpCart>? {
        return cartItems[userId]?.toList()
    }

    fun addProductToCart(userId: Long, productId: Long): Boolean {
        val userCart = cartItems.getOrPut(userId) { mutableListOf() }

        // Check if product already exists
        val existingItem = userCart.find { it.productId == productId }
        if (existingItem != null) {
            // Increase quantity
            val index = userCart.indexOf(existingItem)
            userCart[index] = existingItem.copy(quantity = existingItem.quantity + 1)
        } else {
            // Add new item (you would normally fetch product details here)
            val newCartId = (userCart.maxOfOrNull { it.cartId } ?: 0) + 1
            val product = StaticProductData.getProductById(productId) ?: return false
            userCart.add(
                KmpCart(
                    cartId = newCartId,
                    discount = product.discount,
                    picture = product.picture,
                    price = product.price,
                    productDescription = product.productDescription,
                    productId = productId,
                    productName = product.productName,
                    quantity = 1
                )
            )
        }
        return true
    }

    fun removeProductFromCart(userId: Long, productId: Long): Boolean {
        val userCart = cartItems[userId] ?: return false
        val item = userCart.firstOrNull { it.productId == productId }
        val removed = userCart.remove(item)
        return removed
    }

    fun clearCart(userId: Long) {
        cartItems[userId]?.clear()
    }
}

