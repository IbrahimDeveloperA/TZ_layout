package com.on.tz_layout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.on.tz_layout.databinding.FragmentDetailBinding

class DetailFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnMoreTen.setOnClickListener {
            binding.btnMoreTen.isVisible = view.isInvisible
            binding.btnDtp.isVisible = view.isVisible
            binding.btnSettings.isVisible= view.isVisible
            binding.btnWash.isVisible = view.isVisible
        }

        binding.btnPlus.setOnClickListener {
            binding.btnPlus.isVisible = view.isGone
            binding.btnMinus.isVisible = view.isVisible
            binding.imgLineBottom.isVisible = view.isGone
            binding.tvOil.isVisible = view.isVisible
        }

        binding.btnMinus.setOnClickListener {
            binding.btnMinus.isVisible = view.isGone
            binding.btnPlus.isVisible = view.isVisible
            binding.tvOil.isVisible = view.isGone
            binding.imgLineBottom.isVisible = view.isVisible
        }

    }
}