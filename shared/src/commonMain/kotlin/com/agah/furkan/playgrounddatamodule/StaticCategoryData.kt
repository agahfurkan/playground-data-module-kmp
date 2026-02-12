package com.agah.furkan.playgrounddatamodule

data class KmpCategory(
    val categoryId: Long,
    val categoryName: String,
    val categoryIcon: String = ""
)

object StaticCategoryData {

    private val categories: List<KmpCategory> = listOf(
        KmpCategory(
            categoryId = 1,
            categoryName = "Electronics",
            categoryIcon = "📱"
        ),
        KmpCategory(
            categoryId = 2,
            categoryName = "Computers",
            categoryIcon = "💻"
        ),
        KmpCategory(
            categoryId = 3,
            categoryName = "Audio & Video",
            categoryIcon = "🎧"
        ),
        KmpCategory(
            categoryId = 4,
            categoryName = "Gaming",
            categoryIcon = "🎮"
        ),
        KmpCategory(
            categoryId = 5,
            categoryName = "Smart Home",
            categoryIcon = "🏠"
        ),
        KmpCategory(
            categoryId = 6,
            categoryName = "Wearables",
            categoryIcon = "⌚"
        ),
        KmpCategory(
            categoryId = 7,
            categoryName = "Cameras",
            categoryIcon = "📷"
        ),
        KmpCategory(
            categoryId = 8,
            categoryName = "Accessories",
            categoryIcon = "🔌"
        )
    )

    fun getCategories(): List<KmpCategory> {
        return categories
    }

    fun getCategoryById(categoryId: Long): KmpCategory? {
        return categories.find { it.categoryId == categoryId }
    }
}

