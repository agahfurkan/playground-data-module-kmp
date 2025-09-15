package com.agah.furkan.playgrounddatamodule.model.response

data class CategoryResponse(
    val categoryList: List<Category>
) {
    data class Category(
        val categoryId: Long,
        val categoryName: String
    )
}
