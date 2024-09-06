package com.example.fupsuisample.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fupsuisample.Mock.Mock
import com.example.fupsuisample.Mock.MockCampaigns
import com.example.fupsuisample.R
import com.example.fupsuisample.adapter.CampaignsAdapter
import com.example.fupsuisample.adapter.RecyclerViewAdapter
import com.example.fupsuisample.databinding.FragmentCampaignsBinding


class CampaignsFragment : Fragment() {
    private lateinit var binding: FragmentCampaignsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCampaignsBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerViewCampaign.setHasFixedSize(true)

        val recyclerView: RecyclerView = binding.recyclerViewCampaign
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = CampaignsAdapter(MockCampaigns.getItemCampaignsList())
    }
}
