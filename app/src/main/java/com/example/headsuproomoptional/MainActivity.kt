package com.example.headsuproomoptional

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.headsuproomoptional.DBRoom.CelebrityDatabase
import com.example.headsuproomoptional.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var dbRoom:CelebrityDatabase

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dbRoom=CelebrityDatabase.getInstance(applicationContext)
    }

    fun start(view: android.view.View) {
        if(dbRoom.CelebrityDoa().getAllData().isNotEmpty()){
            startActivity(Intent(applicationContext,HeadsUpGame::class.java))
        }else{
            Toast.makeText(applicationContext, "the  database is empty", Toast.LENGTH_SHORT).show()
        }
    }
    fun addNew(view: android.view.View) {
        startActivity(Intent(applicationContext,AddNewCelebrities::class.java))

    }
}