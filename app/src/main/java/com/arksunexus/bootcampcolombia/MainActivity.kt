package com.arksunexus.bootcampcolombia

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.arksunexus.bootcampcolombia.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ListAdapter
    private val names = mutableListOf("ArkusNexus", "Bootcamp", "Colombia", "Android")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.addButton.setOnClickListener {
            addNameToList()
        }
    }

    private fun addNameToList() {
        val item = binding.nameEditText.text.toString()
        names.add(item)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        binding.namesListView.adapter = adapter
    }
}