package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.response.AnnouncementResponse

class AnnouncementRepositoryImpl() : AnnouncementRepository {

    override suspend fun getAnnouncements(): Result<List<AnnouncementResponse>> {
        return Result.success(
            listOf(
                AnnouncementResponse(description = "persecuti"),
                AnnouncementResponse(description = "maiorum"),
                AnnouncementResponse(description = "inceptos"),
                AnnouncementResponse(description = "harum"),
                AnnouncementResponse(description = "tritani"),
                AnnouncementResponse(description = "ancillae"),
                AnnouncementResponse(description = "eleifend"),
                AnnouncementResponse(description = "tantas"),
                AnnouncementResponse(description = "autem"),
                AnnouncementResponse(description = "habeo"),
            )
        )
    }
}