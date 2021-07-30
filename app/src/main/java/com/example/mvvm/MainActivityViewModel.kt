package com.example.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(sum: Int) : ViewModel() {

    private val sum = MutableLiveData<Int>()

    val totalSum: LiveData<Int>
        get() = sum

    init {
        this.sum.value = sum
    }

    fun add(value: Int) {
        sum.value = sum.value?.plus(value)
    }

}