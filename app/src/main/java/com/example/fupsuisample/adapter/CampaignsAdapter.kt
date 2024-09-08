package com.example.fupsuisample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fupsuisample.adapter.RecyclerViewAdapter.ViewHolder
import com.example.fupsuisample.data.DataCampaign
import com.example.fupsuisample.databinding.ItemCampaignsBinding


class CampaignsAdapter(private val dataArrayList: List<DataCampaign>): RecyclerView.Adapter<CampaignsAdapter.MyViewHolder>() {

    class MyViewHolder(private val binding: ItemCampaignsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: DataCampaign){
            binding.netflixImage.setImageResource(data.image)
            binding.netflixButton.setImageResource(data.imageButon)
            binding.textbaslik.text = data.text
            binding.textaciklama.text = data.text2
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCampaignsBinding.inflate(inflater, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(dataArrayList[position])
    }

    override fun getItemCount(): Int {
        return dataArrayList.size
    }
}

