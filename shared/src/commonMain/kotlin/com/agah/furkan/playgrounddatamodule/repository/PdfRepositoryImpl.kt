package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.response.PdfResponse
import kotlinx.coroutines.delay

class PdfRepositoryImpl : PdfRepository {
    override suspend fun getPdfList(): Result<List<PdfResponse>> {
        delay(20000)
        return Result.success(
            listOf(
                PdfResponse(
                    "1"
                )
            )
        )
    }
}