package com.agah.furkan.playgrounddatamodule.repository

import com.agah.furkan.playgrounddatamodule.model.response.AnnouncementResponse


interface AnnouncementRepository {
    suspend fun getAnnouncements(): Result<List<AnnouncementResponse>>
}