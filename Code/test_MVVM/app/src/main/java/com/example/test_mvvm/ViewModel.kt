package com.example.test_mvvm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class ViewModel(application: Application) : AndroidViewModel(application) {

    var name = MutableLiveData<String>()

    init {
        name.value = "안녕 나는"
    }

    fun reName() {
        name.value = "은지"
    }

}