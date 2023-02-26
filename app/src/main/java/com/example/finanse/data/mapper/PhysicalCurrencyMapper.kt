package com.example.finanse.data.mapper

import com.example.finanse.data.local.PhysicalCurrencyEntity
import com.example.finanse.domain.model.PhysicalCurrency

fun PhysicalCurrencyEntity.toPhysicalCurrency():PhysicalCurrency{
    return PhysicalCurrency(
        currencyCode=currencyCode,
        currencyName=currencyName
    )
}
