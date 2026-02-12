package com.agah.furkan.playgrounddatamodule

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

data class KmpProduct(
    val categoryId: Long,
    val discount: Double,
    val picture: String,
    val price: Double,
    val productDescription: String,
    val productId: Long,
    val productName: String
)

data class KmpProductDetail(
    val categoryId: Int,
    val discount: Double,
    val picture: String,
    val price: Double,
    val productDescription: String,
    val productId: Int,
    val productName: String
)

data class KmpProductDetails(
    val productId: String,
    val productName: String,
    val description: String,
    val sections: List<Section>,
    val reviews: List<Review>
) {
    data class Section(val sectionName: String, val sectionContent: List<SectionDetail>)
    data class SectionDetail(val name: String, val value: String)
    data class Review(val userName: String, val review: String, val rating: Int, val date: String)
}

fun List<KmpProductDetails.Review>.averageRating(): Float {
    return this.map { it.rating }.average().toFloat()
}

fun List<KmpProductDetails.Review>.totalReviewsByRating(): List<Triple<Int, Int, Float>> {
    val groupedByRatingList = this.groupBy { it.rating }
    val listMappedBySize = groupedByRatingList.mapValues { it.value.size }
    val totalReviewSize = listMappedBySize.values.sum()
    //rating, totalReviewSize, averageRating
    val tripleList = mutableListOf(
        Triple(1, 0, 0f),
        Triple(2, 0, 0f),
        Triple(3, 0, 0f),
        Triple(4, 0, 0f),
        Triple(5, 0, 0f)
    )
    listMappedBySize.forEach { item ->
        val matchedItem = tripleList.firstOrNull { it.first == item.key }
        tripleList.remove(matchedItem)
        tripleList.add(Triple(item.key, item.value, item.value / totalReviewSize.toFloat()))
    }
    return tripleList.sortedByDescending { it.first }
}

object StaticProductData {

    private val products: List<KmpProduct> = listOf(
        KmpProduct(
            categoryId = 1,
            discount = 0.15,
            picture = "https://picsum.photos/id/230/400/400",
            price = 299.99,
            productDescription = "High-performance wireless headphones with active noise cancellation and premium sound quality. Perfect for music lovers and professionals.",
            productId = 1,
            productName = "Premium Wireless Headphones"
        ),
        KmpProduct(
            categoryId = 1,
            discount = 0.10,
            picture = "https://picsum.photos/id/231/400/400",
            price = 899.99,
            productDescription = "Latest flagship smartphone with 5G connectivity, advanced camera system, and stunning AMOLED display.",
            productId = 2,
            productName = "Flagship Smartphone Pro"
        ),
        KmpProduct(
            categoryId = 2,
            discount = 0.20,
            picture = "https://picsum.photos/id/232/400/400",
            price = 1299.99,
            productDescription = "Ultra-thin laptop with powerful processor, long battery life, and premium build quality. Perfect for work and entertainment.",
            productId = 3,
            productName = "UltraBook Pro 15"
        ),
        KmpProduct(
            categoryId = 2,
            discount = 0.0,
            picture = "https://picsum.photos/id/233/400/400",
            price = 249.99,
            productDescription = "Smart fitness tracker with heart rate monitoring, GPS tracking, and water resistance. Track your health 24/7.",
            productId = 4,
            productName = "SmartFit Tracker"
        ),
        KmpProduct(
            categoryId = 3,
            discount = 0.25,
            picture = "https://picsum.photos/id/234/400/400",
            price = 449.99,
            productDescription = "4K action camera with stabilization, waterproof housing, and wide-angle lens. Capture your adventures in stunning detail.",
            productId = 5,
            productName = "Action Camera 4K Pro"
        ),
        KmpProduct(
            categoryId = 3,
            discount = 0.05,
            picture = "https://picsum.photos/id/235/400/400",
            price = 199.99,
            productDescription = "Smart home speaker with voice assistant, premium sound, and smart home integration.",
            productId = 6,
            productName = "Smart Speaker Plus"
        ),
        KmpProduct(
            categoryId = 1,
            discount = 0.30,
            picture = "https://picsum.photos/id/236/400/400",
            price = 79.99,
            productDescription = "Wireless gaming mouse with RGB lighting, programmable buttons, and high-precision sensor for competitive gaming.",
            productId = 7,
            productName = "Gaming Mouse Pro"
        ),
        KmpProduct(
            categoryId = 2,
            discount = 0.0,
            picture = "https://picsum.photos/id/237/400/400",
            price = 549.99,
            productDescription = "Professional tablet with stylus support, powerful performance, and beautiful display. Perfect for creativity and productivity.",
            productId = 8,
            productName = "Pro Tablet 11"
        ),
        KmpProduct(
            categoryId = 3,
            discount = 0.15,
            picture = "https://picsum.photos/id/238/400/400",
            price = 349.99,
            productDescription = "True wireless earbuds with active noise cancellation, premium sound quality, and long battery life.",
            productId = 9,
            productName = "Wireless Earbuds Elite"
        ),
        KmpProduct(
            categoryId = 1,
            discount = 0.10,
            picture = "https://picsum.photos/id/239/400/400",
            price = 159.99,
            productDescription = "Mechanical gaming keyboard with RGB backlighting, customizable keys, and durable switches.",
            productId = 10,
            productName = "Mechanical Keyboard Pro"
        )
    )

    fun getProducts(): List<KmpProduct> {
        return products
    }

    fun getProductsByCategoryId(categoryId: Long): List<KmpProduct> {
        return products.filter { it.categoryId == categoryId }
    }

    fun getProductById(productId: Long): KmpProductDetail? {
        val product = products.find { it.productId == productId } ?: return null
        return KmpProductDetail(
            categoryId = product.categoryId.toInt(),
            discount = product.discount,
            picture = product.picture,
            price = product.price,
            productDescription = product.productDescription,
            productId = product.productId.toInt(),
            productName = product.productName
        )
    }

    fun getProductsPaginated(categoryId: Long, pageIndex: Int, pageLength: Int): List<KmpProduct> {
        val allProducts = getProductsByCategoryId(categoryId)
        val startIndex = pageIndex * pageLength
        val endIndex = minOf(startIndex + pageLength, allProducts.size)

        return if (startIndex < allProducts.size) {
            allProducts.subList(startIndex, endIndex)
        } else {
            emptyList()
        }
    }

    fun getKmpProductDetails(): Flow<KmpProductDetails> {
        return flow<KmpProductDetails> {
            emit(
                KmpProductDetails(
                    productId = "quaerendum",
                    productName = "Winfred Vasquez",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do" +
                            " eiusmod tempor incididunt ut labore et dolore magna aliqua. Lorem ipsum " +
                            "dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                            " ut labore et dolore magna aliqua. Lorem ipsum dolor sit amet, consectetur adipiscing" +
                            " elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                            " Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod" +
                            " tempor incididunt ut labore et dolore magna aliqua. Lorem ipsum dolor sit " +
                            "amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                            "labore et dolore magna aliqua. Lorem ipsum dolor sit amet, consectetur " +
                            "adipiscing elit, sed do eiusmod tempor incididunt ut labore et " +
                            "dolore magna aliqua.",
                    sections = listOf(
                        KmpProductDetails.Section(
                            sectionName = "Liza Olsen",
                            sectionContent = listOf(
                                KmpProductDetails.SectionDetail(
                                    name = "Diana Ford",
                                    value = "idque"
                                ),
                                KmpProductDetails.SectionDetail(
                                    name = "Marlin Henson",
                                    value = "quod"
                                )
                            )
                        ),
                        KmpProductDetails.Section(
                            sectionName = "Liza Olsen",
                            sectionContent = listOf(
                                KmpProductDetails.SectionDetail(
                                    name = "Diana Ford",
                                    value = "idque"
                                ),
                                KmpProductDetails.SectionDetail(
                                    name = "Shawna Wiggins",
                                    value = "euismod"
                                ),
                                KmpProductDetails.SectionDetail(
                                    name = "Janie Marshall",
                                    value = "comprehensam"
                                )
                            )
                        ),
                        KmpProductDetails.Section(
                            sectionName = "Liza Olsen",
                            sectionContent = listOf(
                                KmpProductDetails.SectionDetail(
                                    name = "Diana Ford",
                                    value = "idque"
                                )
                            )
                        )
                    ),
                    reviews = generateFakeReviewList()
                )
            )
        }
    }

    fun generateFakeReviewList(): List<KmpProductDetails.Review> {
        val reviewList = mutableListOf<KmpProductDetails.Review>()
        for (i in 0..9) {
            reviewList.add(
                KmpProductDetails.Review(
                    userName = "Tracie Richmond",
                    review = "accommodare",
                    rating = Random.nextInt(1, 6),
                    date = "senectus"
                )
            )
        }
        return reviewList
    }
}

