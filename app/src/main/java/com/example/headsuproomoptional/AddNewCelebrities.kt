package com.example.headsuproomoptional

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.headsuproomoptional.DBRoom.Celebrity
import com.example.headsuproomoptional.DBRoom.CelebrityDatabase
import com.example.headsuproomoptional.databinding.ActivityAddNewCelebritiesBinding

class AddNewCelebrities : AppCompatActivity() {
    lateinit var binding: ActivityAddNewCelebritiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddNewCelebritiesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dbRoom=CelebrityDatabase.getInstance(applicationContext)
        binding.btnAdd.setOnClickListener {
            val name=binding.edName.text.toString()
            val taboo1=binding.edTaboo1.text.toString()
            val taboo2=binding.edTaboo2.text.toString()
            val taboo3=binding.edTaboo3.text.toString()
            if (name.isNotEmpty()&&taboo1.isNotEmpty()&&taboo2.isNotEmpty()&&taboo3.isNotEmpty())
            {
                val celebrity=Celebrity(0,name,taboo1,taboo2,taboo3)
                val status=dbRoom.CelebrityDoa().addCelebrity(celebrity)

                    Toast.makeText(applicationContext, "Done ", Toast.LENGTH_SHORT).show()
                    binding.edName.text.clear()
                    binding.edTaboo1.text.clear()
                    binding.edTaboo2.text.clear()
                    binding.edTaboo3.text.clear()
                    Log.d("asdffsda561",dbRoom.CelebrityDoa().getAllData().toString())
            }
            else
            {
                Toast.makeText(applicationContext, "some filed is empty", Toast.LENGTH_SHORT).show()
            }
        }
    }
}