package com.arksunexus.bootcampcolombia

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.arksunexus.bootcampcolombia.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: BaseAdapter

    private val names = mutableListOf("ArkusNexus", "Bootcamp", "Colombia", "Android")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BootcampColombia", "Lifecycle: onCreate")
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupListView()
        setupButton()
    }

    override fun onStart() {
        super.onStart()
        Log.d("BootcampColombia", "Lifecycle: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BootcampColombia", "Lifecycle: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BootcampColombia", "Lifecycle: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BootcampColombia", "Lifecycle: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BootcampColombia", "Lifecycle: onDestroy")
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