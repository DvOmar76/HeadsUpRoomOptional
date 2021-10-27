package com.example.headsuproomoptional.DBRoom
import androidx.room.*
@Dao
interface CelebrityDoa {
    @Query("select * from Celebrity order by id ASC")
    fun getAllData():List<Celebrity>
    @Insert
    fun addCelebrity(celebrity:Celebrity)
    @Update
    fun updateCelebrity(celebrity:Celebrity)
    @Delete
    fun deleteCelebrity(celebrity:Celebrity)
}