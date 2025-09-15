package com.agah.furkan.playgrounddatamodule.model

import com.agah.furkan.playgrounddatamodule.model.response.CategoryResponse


data class CategoryDomainModel(
    val categoryId: Long,
    val categoryName: String
)

fun CategoryResponse.Category.asDomainModel() = CategoryDomainModel(
    categoryId = categoryId,
    categoryName = categoryName
)