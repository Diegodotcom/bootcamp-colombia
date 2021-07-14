package com.arksunexus.bootcampcolombia.network

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("v3/89fb85e8-b374-409e-b106-c8cf29b4e99d")
    suspend fun fetchCountries(): Response<List<CountryResponse>>
}