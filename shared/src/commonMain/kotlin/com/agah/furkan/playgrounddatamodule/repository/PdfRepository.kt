package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.response.PdfResponse

interface PdfRepository {
    suspend fun getPdfList(): Result<List<PdfResponse>>
}