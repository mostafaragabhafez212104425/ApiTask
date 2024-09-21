package com.example.apitask

import javax.inject.Inject

class AlbumRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getAlbums(): List<Album> {
        return apiService.getAlbums()
    }
}
