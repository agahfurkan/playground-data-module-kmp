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

    fun getCartForUser(userId: Long): List<KmpCart> {
        return cartItems[userId]?.toList() ?: getDefaultCart(userId)
    }

    private fun getDefaultCart(userId: Long): List<KmpCart> {
        val defaultItems = mutableListOf(
            KmpCart(
                cartId = 1,
                discount = 0.15,
                picture = "https://picsum.photos/400/400?random=1",
                price = 299.99,
                productDescription = "High-performance wireless headphones with active noise cancellation.",
                productId = 1,
                productName = "Premium Wireless Headphones",
                quantity = 1
            ),
            KmpCart(
                cartId = 2,
                discount = 0.10,
                picture = "https://picsum.photos/400/400?random=2",
                price = 899.99,
                productDescription = "Latest flagship smartphone with 5G connectivity.",
                productId = 2,
                productName = "Flagship Smartphone Pro",
                quantity = 2
            ),
            KmpCart(
                cartId = 3,
                discount = 0.30,
                picture = "https://picsum.photos/400/400?random=7",
                price = 79.99,
                productDescription = "Wireless gaming mouse with RGB lighting.",
                productId = 7,
                productName = "Gaming Mouse Pro",
                quantity = 1
            )
        )
        cartItems[userId] = defaultItems
        return defaultItems
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
            userCart.add(
                KmpCart(
                    cartId = newCartId,
                    discount = 0.0,
                    picture = "https://picsum.photos/400/400?random=$productId",
                    price = 99.99,
                    productDescription = "Product description for product $productId",
                    productId = productId,
                    productName = "Product $productId",
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

