package com.hegsam.travelbook.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.hegsam.travelbook.model.Place
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

/**
 * Created by Salih ÇABUK on 6.09.2021.
 */
@Dao
interface PlaceDao {

    @Query("SELECT * FROM Place")
    fun getAll() : Flowable<List<Place>>

    @Insert
    fun insert(place : Place) : Completable

    @Delete
    fun delete(place : Place) : Completable

}