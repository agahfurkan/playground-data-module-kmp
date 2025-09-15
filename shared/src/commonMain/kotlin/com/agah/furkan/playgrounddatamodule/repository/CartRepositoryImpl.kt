package com.agah.furkan.data.alldata

import com.agah.furkan.playgrounddatamodule.model.CartDomainModel
import com.agah.furkan.playgrounddatamodule.repository.CartRepository

class CartRepositoryImpl() : CartRepository {

    override suspend fun getCart(refresh: Boolean, userId: Long): Result<List<CartDomainModel>> {
        return Result.success(
            listOf(
                CartDomainModel(
                    cartId = 1L,
                    discount = 10.0,
                    picture = "https://picsum.photos/200",
                    price = 100.0,
                    productDescription = "Fake Product 1 Description",
                    productId = 1L,
                    productName = "Fake Product 1"
                ),
                CartDomainModel(
                    cartId = 2L,
                    discount = 5.0,
                    picture = "https://picsum.photos/200",
                    price = 50.0,
                    productDescription = "Fake Product 2 Description",
                    productId = 2L,
                    productName = "Fake Product 2"
                )
            )
        )
    }


    override suspend fun addProductToCart(productId: Long, userId: Long): Result<String> =
        Result.success("Product added to cart successfully")

    override suspend fun removeProductFromCart(productId: Long, userId: Long): Result<String> =
        Result.success("Product removed from cart successfully")
}
