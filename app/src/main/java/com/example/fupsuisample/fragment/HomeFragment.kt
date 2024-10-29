package com.example.fupsuisample.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fupsuisample.Mock.MockBottom
import com.example.fupsuisample.R
import com.example.fupsuisample.adapter.BottomSheetAdapter
import com.example.fupsuisample.databinding.BottomSheetDialogBinding
import com.example.fupsuisample.databinding.FragmentCampaignsBinding
import com.example.fupsuisample.databinding.FragmentHomeBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<FrameLayout>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomSheet = binding.bottomSheet
        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

        // Başlangıç ve bitiş yüksekliğini ayarlayın
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED // veya STATE_EXPANDED
        bottomSheetBehavior.isDraggable = true // Kaydırma özelliğini etkinleştir
        bottomSheetBehavior.peekHeight = 300 // Yalnızca küçük bir kısmının göründüğü yükseklik


        bottomSheetBehavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                // Durum değişikliklerini burada yönetebilirsiniz
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                // Kaydırma sırasında yapılacak animasyonlar
            }
        })

        binding.bottomSheetRcv.setHasFixedSize(true)
        val recyclerView: RecyclerView = binding.bottomSheetRcv
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = BottomSheetAdapter(MockBottom.getItemBottomList())
    }

    }

