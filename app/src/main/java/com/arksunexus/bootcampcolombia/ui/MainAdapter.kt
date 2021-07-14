package com.arksunexus.bootcampcolombia.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.arksunexus.bootcampcolombia.databinding.ItemNameViewBinding
import com.arksunexus.bootcampcolombia.network.CountryResponse

class MainAdapter : ListAdapter<CountryResponse, MainViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val itemNameViewBinding =
            ItemNameViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainViewHolder(itemNameViewBinding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val countryItem = getItem(position)

        holder.binding.countryName.text = countryItem.name
        holder.binding.countryCode.text = countryItem.code
    }

    companion object {
        val DIFF_CALLBACK: DiffUtil.ItemCallback<CountryResponse> =
            object : DiffUtil.ItemCallback<CountryResponse>() {
                override fun areItemsTheSame(
                    oldCountry: CountryResponse,
                    newCountry: CountryResponse
                ): Boolean {
                    return oldCountry.code == newCountry.code
                }

                override fun areContentsTheSame(
                    oldCountry: CountryResponse,
                    newCountry: CountryResponse
                ): Boolean {
                    return oldCountry == newCountry
                }
            }
    }
}

class MainViewHolder(var binding: ItemNameViewBinding) : RecyclerView.ViewHolder(binding.root)