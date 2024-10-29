package com.example.daggerhiltcryptocurrency

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val cryptocurrencyRepository: CryptoCurrencyRepository
) : ViewModel() {
    private val cryptocurrencyEmitter = MutableLiveData<List<CryptoCurrency>>()
    val cryptoCurrency: LiveData<List<CryptoCurrency>> = cryptocurrencyEmitter
    init {
        loadCryptocurrency()
    }

    private fun loadCryptocurrency() {
        cryptocurrencyEmitter.value = cryptocurrencyRepository.getCryptoCurrency()
    }
}