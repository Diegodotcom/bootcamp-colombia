package com.arksunexus.bootcampcolombia.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arksunexus.bootcampcolombia.network.ApiClient
import com.arksunexus.bootcampcolombia.network.CountryResponse
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _names = MutableLiveData<List<CountryResponse>>()
    val names: LiveData<List<CountryResponse>> = _names

    init {
        fetchCountries()
    }

    fun addNameToList(name: String) {
        //listOfNames.add(name)
    }

    private fun fetchCountries() {
        viewModelScope.launch {
            val response = ApiClient.apiService.fetchCountries()

            if (response.isSuccessful && response.body() != null) {
                _names.value = response.body()
            }

            Log.d("BootcampColombia", "Response: " + response.code())
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("BootcampColombia", "ViewModel Lifecycle: onCleared")
    }
}