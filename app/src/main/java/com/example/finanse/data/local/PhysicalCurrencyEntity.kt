package com.example.finanse.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PhysicalCurrencyEntity(
    val currencyCode: String,
    val currencyName: String,
    @PrimaryKey val id: Int? = null
)
