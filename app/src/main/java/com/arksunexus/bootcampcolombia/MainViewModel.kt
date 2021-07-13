package com.arksunexus.bootcampcolombia

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _names = MutableLiveData<List<String>>()
    val names: LiveData<List<String>> = _names

    private val listOfNames = mutableListOf("ArkusNexus", "Bootcamp", "Colombia", "Android")

    init {
        _names.value = listOfNames
    }

    fun addNameToList(name: String) {
        listOfNames.add(name)
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("BootcampColombia", "ViewModel Lifecycle: onCleared")
    }
}