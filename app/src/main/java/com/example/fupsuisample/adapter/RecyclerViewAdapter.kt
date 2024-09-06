package com.example.fupsuisample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fupsuisample.data.DataList
import com.example.fupsuisample.databinding.ItemTransactionsBinding

class RecyclerViewAdapter(private val dataArrayList: List<DataList>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemTransactionsBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data: DataList){
            binding.itemImage.setImageResource(data.image)
            binding.itemText.text = data.title
            binding.itemText2.text = data.subtitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTransactionsBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataArrayList[position]
        holder.bind(data)
    }
}
