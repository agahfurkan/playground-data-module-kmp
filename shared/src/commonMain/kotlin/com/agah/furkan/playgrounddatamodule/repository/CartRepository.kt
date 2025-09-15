package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.CartDomainModel

interface CartRepository {
    suspend fun getCart(
        refresh: Boolean = false,
        userId: Long
    ): Result<List<CartDomainModel>>

    suspend fun addProductToCart(productId: Long, userId: Long): Result<String>
    suspend fun removeProductFromCart(productId: Long, userId: Long): Result<String>
}
