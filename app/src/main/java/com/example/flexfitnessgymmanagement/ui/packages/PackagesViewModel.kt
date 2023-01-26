package com.example.flexfitnessgymmanagement.ui.packages

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PackagesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is packages Fragment"
    }
    val text: LiveData<String> = _text
}