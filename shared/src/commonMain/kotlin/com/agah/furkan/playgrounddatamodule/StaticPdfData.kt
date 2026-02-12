package com.agah.furkan.playgrounddatamodule

data class KmpPdf(
    val pdfId: Long,
    val data: String,
    val title: String = "",
    val description: String = "",
    val fileSize: String = "",
    val url: String = ""
)

object StaticPdfData {

    private val pdfList: List<KmpPdf> = listOf(
        KmpPdf(
            pdfId = 1,
            data = "product_catalog_2026",
            title = "Product Catalog 2026",
            description = "Complete product catalog with specifications and pricing information.",
            fileSize = "2.5 MB",
            url = "https://example.com/pdfs/product_catalog_2026.pdf"
        ),
        KmpPdf(
            pdfId = 2,
            data = "user_manual_headphones",
            title = "Wireless Headphones User Manual",
            description = "Comprehensive user manual for Premium Wireless Headphones.",
            fileSize = "1.2 MB",
            url = "https://example.com/pdfs/user_manual_headphones.pdf"
        ),
        KmpPdf(
            pdfId = 3,
            data = "warranty_information",
            title = "Warranty Information",
            description = "Detailed warranty terms and conditions for all products.",
            fileSize = "850 KB",
            url = "https://example.com/pdfs/warranty_information.pdf"
        ),
        KmpPdf(
            pdfId = 4,
            data = "quick_start_guide",
            title = "Quick Start Guide",
            description = "Quick start guide for setting up your new devices.",
            fileSize = "500 KB",
            url = "https://example.com/pdfs/quick_start_guide.pdf"
        ),
        KmpPdf(
            pdfId = 5,
            data = "safety_instructions",
            title = "Safety Instructions",
            description = "Important safety instructions for electronic products.",
            fileSize = "750 KB",
            url = "https://example.com/pdfs/safety_instructions.pdf"
        ),
        KmpPdf(
            pdfId = 6,
            data = "technical_specifications",
            title = "Technical Specifications",
            description = "Detailed technical specifications for all product lines.",
            fileSize = "3.1 MB",
            url = "https://example.com/pdfs/technical_specifications.pdf"
        ),
        KmpPdf(
            pdfId = 7,
            data = "troubleshooting_guide",
            title = "Troubleshooting Guide",
            description = "Common issues and solutions for our products.",
            fileSize = "1.8 MB",
            url = "https://example.com/pdfs/troubleshooting_guide.pdf"
        ),
        KmpPdf(
            pdfId = 8,
            data = "return_policy",
            title = "Return Policy Document",
            description = "Complete information about our return and refund policy.",
            fileSize = "650 KB",
            url = "https://example.com/pdfs/return_policy.pdf"
        )
    )

    fun getPdfById(pdfId: Long): KmpPdf? {
        return pdfList.find { it.pdfId == pdfId }
    }

    fun searchPdfs(query: String): List<KmpPdf> {
        return pdfList.filter {
            it.title.contains(query, ignoreCase = true) ||
            it.description.contains(query, ignoreCase = true)
        }
    }
}

