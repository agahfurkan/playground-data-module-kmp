package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.ProductDetailDomainModel
import com.agah.furkan.playgrounddatamodule.model.ProductDomainModel

interface ProductRepository {
    suspend fun getProductList(
        categoryId: Long,
        pageIndex: Int,
        pageLength: Int
    ): Result<List<ProductDomainModel>>

    suspend fun getProductDetail(productId: Long): Result<ProductDetailDomainModel>
}
