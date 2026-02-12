package com.agah.furkan.playgrounddatamodule

data class KmpAnnouncement(
    val id: Long,
    val description: String,
    val title: String = "",
    val date: String = "",
    val priority: String = "normal"
)

object StaticAnnouncementData {

    private val announcements: List<KmpAnnouncement> = listOf(
        KmpAnnouncement(
            id = 1,
            title = "New Year Sale",
            description = "Get up to 50% off on selected electronics! Limited time offer. Shop now and save big on your favorite products.",
            date = "2026-01-15",
            priority = "high"
        ),
        KmpAnnouncement(
            id = 2,
            title = "Free Shipping Weekend",
            description = "Enjoy free shipping on all orders this weekend. No minimum purchase required.",
            date = "2026-01-14",
            priority = "medium"
        ),
        KmpAnnouncement(
            id = 3,
            title = "New Products Available",
            description = "Check out our latest collection of smart home devices and wearable technology.",
            date = "2026-01-12",
            priority = "normal"
        ),
        KmpAnnouncement(
            id = 4,
            title = "Extended Return Policy",
            description = "We've extended our return policy to 60 days for all purchases made in January.",
            date = "2026-01-10",
            priority = "medium"
        ),
        KmpAnnouncement(
            id = 5,
            title = "Mobile App Launch",
            description = "Download our new mobile app and get exclusive app-only discounts and early access to sales.",
            date = "2026-01-08",
            priority = "high"
        ),
        KmpAnnouncement(
            id = 6,
            title = "Loyalty Program",
            description = "Join our loyalty program and earn points on every purchase. Redeem points for discounts and exclusive rewards.",
            date = "2026-01-05",
            priority = "normal"
        ),
        KmpAnnouncement(
            id = 7,
            title = "Customer Service Update",
            description = "Our customer service hours have been extended. We're now available 24/7 to assist you.",
            date = "2026-01-03",
            priority = "normal"
        ),
        KmpAnnouncement(
            id = 8,
            title = "Payment Options",
            description = "We now accept additional payment methods including digital wallets and buy now, pay later options.",
            date = "2026-01-01",
            priority = "medium"
        )
    )

    fun getAnnouncementById(id: Long): KmpAnnouncement? {
        return announcements.find { it.id == id }
    }

    fun getAnnouncementsByPriority(priority: String): List<KmpAnnouncement> {
        return announcements.filter { it.priority == priority }
    }
}

