package com.example.fupsuisample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fupsuisample.data.DataBottomSheet
import com.example.fupsuisample.databinding.ItemBottomsheetBinding

class BottomSheetAdapter(private val bottomSheetList: List<DataBottomSheet>) : RecyclerView.Adapter<BottomSheetAdapter.BottomSheetViewHolder>() {

    class BottomSheetViewHolder(private val binding: ItemBottomsheetBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: DataBottomSheet) {
            binding.tarih.text = data.tarih
            binding.imageView.setImageResource(data.imageView)
            binding.aciklama.text = data.aciklama
            binding.ucret.text = data.ucret
            binding.saat.text = data.saat
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BottomSheetViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBottomsheetBinding.inflate(inflater, parent, false)
        return BottomSheetViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return bottomSheetList.size
    }

    override fun onBindViewHolder(holder: BottomSheetViewHolder, position: Int) {
        val data = bottomSheetList[position]
        holder.bind(data)
    }
}