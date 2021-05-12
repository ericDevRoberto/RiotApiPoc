package com.example.lolgg.core

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class ViewModelCore<T> : ViewModel() {

    val mutableLiveData = MutableLiveData<T>()
}