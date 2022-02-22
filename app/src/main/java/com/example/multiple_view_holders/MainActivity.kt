package com.example.multiple_view_holders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiple_view_holders.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val adapterList by lazy {Adapter()}
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val itemList = Database.getItems()
        adapterList.updateList(itemList)
        binding.recyclerView.apply {
            layoutManager =LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL,false)
            adapter = adapterList
        }


    }
}