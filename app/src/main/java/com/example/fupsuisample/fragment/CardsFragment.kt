package com.example.fupsuisample.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fupsuisample.Mock.MockBottom
import com.example.fupsuisample.Mock.MockCampaigns
import com.example.fupsuisample.R
import com.example.fupsuisample.adapter.BottomSheetAdapter
import com.example.fupsuisample.adapter.CampaignsAdapter
import com.example.fupsuisample.databinding.FragmentCardsBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior


class CardsFragment : Fragment() {

    private lateinit var binding: FragmentCardsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCardsBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val bottomSheet = view.findViewById<FrameLayout>(R.id.bottomSheet)
        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
        val bottomSheetBehavior1 = BottomSheetBehavior.from(bottomSheet)

        // Başlangıç ve bitiş yüksekliğini ayarlayın
        bottomSheetBehavior1.state = BottomSheetBehavior.STATE_COLLAPSED // veya STATE_EXPANDED
        bottomSheetBehavior1.isDraggable = true // Kaydırma özelliğini etkinleştir
        bottomSheetBehavior1.peekHeight = 300 // Yalnızca küçük bir kısmının göründüğü yükseklik

        // Başlangıçta daraltılmış durumda olacak
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED

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








//BottomSheetBehavior.from(binding.root).apply {
//    peekHeight = 200
//    this.state = BottomSheetBehavior.STATE_COLLAPSED
//}