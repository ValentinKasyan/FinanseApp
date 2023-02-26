package com.example.finanse.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [PhysicalCurrencyEntity::class],
    version = 1
)
abstract class PhysicalCurrencyDatabase : RoomDatabase() {
    abstract val dao: PhysicalCurrencyDao
}