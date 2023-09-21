package com.on.tz_layout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.on.tz_layout.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var adapterCarInfo: CarAdapter
    private lateinit var adapterCircle: CarCircleAdapter
    private lateinit var adapterProduct: ProductAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapterCarInfo = CarAdapter(this::onClick)
        adapterCircle = CarCircleAdapter()
        adapterProduct = ProductAdapter()

        binding.viewPager.adapter = adapterCarInfo
        adapterCarInfo.registerAdapterDataObserver(binding.indicator.adapterDataObserver)
        binding.indicator.setViewPager(binding.viewPager)

        binding.viewPagerCarCircle.adapter = adapterCircle
        adapterCircle.registerAdapterDataObserver(binding.indicatorCarCircle.adapterDataObserver)
        binding.indicatorCarCircle.setViewPager(binding.viewPagerCarCircle)

        binding.viewPagerProduct.adapter = adapterProduct
        adapterProduct.registerAdapterDataObserver(binding.indicatorProduct.adapterDataObserver)
        binding.indicatorProduct.setViewPager(binding.viewPagerProduct)
    }

    private fun onClick() {
        DetailFragment().show(requireActivity().supportFragmentManager,"")
    }
}