package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.CategoryDomainModel

class CategoryRepositoryImpl(
) : CategoryRepository {


    override suspend fun fetchMainProductCategories(): Result<List<CategoryDomainModel>> =
        Result.success(
            listOf(
                CategoryDomainModel(categoryId = 1L, categoryName = "Fake Category 1"),
                CategoryDomainModel(categoryId = 2L, categoryName = "Fake Category 2")
            )
        )
}
