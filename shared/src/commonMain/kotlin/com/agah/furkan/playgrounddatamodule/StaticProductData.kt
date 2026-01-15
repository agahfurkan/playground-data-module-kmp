package com.agah.furkan.playgrounddatamodule

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

object StaticProductData {

    fun getProducts(): List<KmpProduct> = listOf(
        KmpProduct(
            categoryId = 1,
            discount = 0.15,
            picture = "https://picsum.photos/400/400?random=1",
            price = 299.99,
            productDescription = "High-performance wireless headphones with active noise cancellation and premium sound quality. Perfect for music lovers and professionals.",
            productId = 1,
            productName = "Premium Wireless Headphones"
        ),
        KmpProduct(
            categoryId = 1,
            discount = 0.10,
            picture = "https://picsum.photos/400/400?random=2",
            price = 899.99,
            productDescription = "Latest flagship smartphone with 5G connectivity, advanced camera system, and stunning AMOLED display.",
            productId = 2,
            productName = "Flagship Smartphone Pro"
        ),
        KmpProduct(
            categoryId = 2,
            discount = 0.20,
            picture = "https://picsum.photos/400/400?random=3",
            price = 1299.99,
            productDescription = "Ultra-thin laptop with powerful processor, long battery life, and premium build quality. Perfect for work and entertainment.",
            productId = 3,
            productName = "UltraBook Pro 15"
        ),
        KmpProduct(
            categoryId = 2,
            discount = 0.0,
            picture = "https://picsum.photos/400/400?random=4",
            price = 249.99,
            productDescription = "Smart fitness tracker with heart rate monitoring, GPS tracking, and water resistance. Track your health 24/7.",
            productId = 4,
            productName = "SmartFit Tracker"
        ),
        KmpProduct(
            categoryId = 3,
            discount = 0.25,
            picture = "https://picsum.photos/400/400?random=5",
            price = 449.99,
            productDescription = "4K action camera with stabilization, waterproof housing, and wide-angle lens. Capture your adventures in stunning detail.",
            productId = 5,
            productName = "Action Camera 4K Pro"
        ),
        KmpProduct(
            categoryId = 3,
            discount = 0.05,
            picture = "https://picsum.photos/400/400?random=6",
            price = 199.99,
            productDescription = "Smart home speaker with voice assistant, premium sound, and smart home integration.",
            productId = 6,
            productName = "Smart Speaker Plus"
        ),
        KmpProduct(
            categoryId = 1,
            discount = 0.30,
            picture = "https://picsum.photos/400/400?random=7",
            price = 79.99,
            productDescription = "Wireless gaming mouse with RGB lighting, programmable buttons, and high-precision sensor for competitive gaming.",
            productId = 7,
            productName = "Gaming Mouse Pro"
        ),
        KmpProduct(
            categoryId = 2,
            discount = 0.0,
            picture = "https://picsum.photos/400/400?random=8",
            price = 549.99,
            productDescription = "Professional tablet with stylus support, powerful performance, and beautiful display. Perfect for creativity and productivity.",
            productId = 8,
            productName = "Pro Tablet 11"
        ),
        KmpProduct(
            categoryId = 3,
            discount = 0.15,
            picture = "https://picsum.photos/400/400?random=9",
            price = 349.99,
            productDescription = "True wireless earbuds with active noise cancellation, premium sound quality, and long battery life.",
            productId = 9,
            productName = "Wireless Earbuds Elite"
        ),
        KmpProduct(
            categoryId = 1,
            discount = 0.10,
            picture = "https://picsum.photos/400/400?random=10",
            price = 159.99,
            productDescription = "Mechanical gaming keyboard with RGB backlighting, customizable keys, and durable switches.",
            productId = 10,
            productName = "Mechanical Keyboard Pro"
        )
    )

    fun getProductsByCategoryId(categoryId: Long): List<KmpProduct> {
        return getProducts().filter { it.categoryId == categoryId }
    }

    fun getProductById(productId: Long): KmpProductDetail? {
        val product = getProducts().find { it.productId == productId } ?: return null
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
}

