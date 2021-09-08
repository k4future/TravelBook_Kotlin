package com.hegsam.travelbook.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

/**
 * Created by Salih ÇABUK on 5.09.2021.
 */
@Entity
data class Place (
    @ColumnInfo(name = "name")
    val name : String,

    @ColumnInfo(name = "latitude")
    val latitude : Double,

    @ColumnInfo(name = "longitude")
    val longitude : Double
    ) : Serializable
{
    @PrimaryKey(autoGenerate = true)
    var id = 0
}