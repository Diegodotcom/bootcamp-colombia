package com.arksunexus.bootcampcolombia

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.arksunexus.bootcampcolombia.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MainAdapter

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("BootcampColombia", "Lifecycle: onCreate")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.names.observe(this@MainActivity) { names ->
//            adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
            binding.namesRecyclerView.adapter = adapter
        }

        setupButton()
    }

    private fun setupButton() {
        binding.addButton.setOnClickListener {
            addNameToList()
        }
    }

    private fun addNameToList() {
        val item = binding.nameEditText.text.toString()
        mainViewModel.addNameToList(item)
        adapter.notifyDataSetChanged()
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
}