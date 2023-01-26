package com.example.flexfitnessgymmanagement.ui.sessions

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SessionsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is sessions Fragment"
    }
    val text: LiveData<String> = _text
}