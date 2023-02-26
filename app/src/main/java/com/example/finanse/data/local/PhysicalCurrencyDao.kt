package com.example.finanse.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PhysicalCurrencyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPhysicalCurrency(
        physicalCurrencyEntity: List<PhysicalCurrencyEntity>
    )

    @Query("DELETE FROM physicalCurrencyEntity")
    suspend fun clearPhysicalCurrency()

    @Query(
        """
            SELECT * FROM physicalcurrencyentity
            WHERE LOWER(currencyName) LIKE '%' || LOWER(:query) || '%' OR
                UPPER(:query) == currencyCode
        """
    )
    suspend fun searchPhysicalCurrency(
        query: String
    ): List<PhysicalCurrencyEntity>
}