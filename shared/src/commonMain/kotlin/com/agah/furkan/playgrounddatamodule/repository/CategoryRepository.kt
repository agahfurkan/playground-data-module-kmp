package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.CategoryDomainModel

interface CategoryRepository {
    suspend fun fetchMainProductCategories(): Result<List<CategoryDomainModel>>
}
