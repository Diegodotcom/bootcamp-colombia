package com.arksunexus.bootcampcolombia

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.arksunexus.bootcampcolombia.databinding.ItemNameViewBinding

class MainAdapter : ListAdapter<ApiResponse, MainViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        TODO("Not yet implemented")

        holder.binding.countryName.text = ""
        holder.binding.countryCode.text = ""
    }

    companion object {
        val DIFF_CALLBACK: DiffUtil.ItemCallback<ApiResponse> =
            object : DiffUtil.ItemCallback<ApiResponse>() {
                override fun areItemsTheSame(
                    oldString: ApiResponse,
                    newString: ApiResponse
                ): Boolean {
                    return oldString == newString
                }

                override fun areContentsTheSame(
                    oldFacility: ApiResponse,
                    newFacility: ApiResponse
                ): Boolean {
                    return oldFacility == newFacility
                }
            }
    }
}

class MainViewHolder(var binding: ItemNameViewBinding) : RecyclerView.ViewHolder(binding.root)