package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.ProductDetailDomainModel
import com.agah.furkan.playgrounddatamodule.model.ProductDomainModel

class ProductRepositoryImpl() : ProductRepository {
    override suspend fun getProductList(
        categoryId: Long,
        pageIndex: Int,
        pageLength: Int
    ): Result<List<ProductDomainModel>> {
        return Result.success(
            listOf(
                ProductDomainModel(
                    categoryId = 1L,
                    discount = 10.0,
                    picture = "https://picsum.photos/200",
                    price = 100.0,
                    productDescription = "Fake Product 1 Description",
                    productId = 1L,
                    productName = "Fake Product 1"
                ),
                ProductDomainModel(
                    categoryId = 2L,
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

    override suspend fun getProductDetail(productId: Long): Result<ProductDetailDomainModel> =
        Result.success(
            ProductDetailDomainModel(
                categoryId = 1,
                discount = 10.0,
                picture = "https://picsum.photos/200",
                price = 100.0,
                productDescription = "Fake Product Detail Description",
                productId = 1,
                productName = "Fake Product Detail"
            )
        )
}
