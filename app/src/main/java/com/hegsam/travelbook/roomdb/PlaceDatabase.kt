package com.hegsam.travelbook.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hegsam.travelbook.model.Place

/**
 * Created by Salih ÇABUK on 6.09.2021.
 */
@Database(entities = arrayOf(Place::class),version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao() : PlaceDao
}