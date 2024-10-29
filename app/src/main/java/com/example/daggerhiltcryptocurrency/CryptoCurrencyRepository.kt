package com.example.daggerhiltcryptocurrency

interface CryptoCurrencyRepository {
    fun getCryptoCurrency() :List<CryptoCurrency>
}