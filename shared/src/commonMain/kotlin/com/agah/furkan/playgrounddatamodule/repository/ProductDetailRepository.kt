package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.response.ProductDetail
import kotlinx.coroutines.flow.Flow

interface ProductDetailRepository {
    fun getProductDetails(): Flow<ProductDetail>
}