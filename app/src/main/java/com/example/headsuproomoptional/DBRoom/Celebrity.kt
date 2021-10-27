package com.example.headsuproomoptional.DBRoom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Celebrity")
data class Celebrity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name="id") val id:Int=0,
    @ColumnInfo(name="name") val name:String,
    @ColumnInfo(name="taboo1") val taboo1:String,
    @ColumnInfo(name="taboo2") val taboo2:String,
    @ColumnInfo(name="taboo3")val taboo3:String
    )
