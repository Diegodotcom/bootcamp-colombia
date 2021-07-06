package com.arksunexus.bootcampcolombia

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import androidx.appcompat.app.AppCompatActivity
import com.arksunexus.bootcampcolombia.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: BaseAdapter

    private val names = mutableListOf("ArkusNexus", "Bootcamp", "Colombia", "Android")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupListView()
        setupButton()
    }

    private fun setupListView() {
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        binding.namesListView.adapter = adapter
    }

    private fun setupButton() {
        binding.addButton.setOnClickListener {
            addNameToList()
        }
    }

    private fun addNameToList() {
        val item = binding.nameEditText.text.toString()
        names.add(item)
        adapter.notifyDataSetChanged()
    }
}