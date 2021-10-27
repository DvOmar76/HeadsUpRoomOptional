package com.example.headsuproomoptional.DBRoom
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [Celebrity::class],version = 1,exportSchema = false)
abstract class CelebrityDatabase: RoomDatabase() {
    companion object{
        var instance: CelebrityDatabase? = null
        fun getInstance(context: Context): CelebrityDatabase
        {
            if (instance != null)
            {
                return instance as CelebrityDatabase
            }
            instance = Room.databaseBuilder(context, CelebrityDatabase::class.java, "Celebrity").run {allowMainThreadQueries() }.build()
            return instance as CelebrityDatabase
        }
    }
    abstract fun CelebrityDoa():CelebrityDoa
}