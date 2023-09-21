package com.on.tz_layout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.on.tz_layout.databinding.ItemCircleCarBinding

class CarCircleAdapter() : RecyclerView.Adapter<CarCircleAdapter.CarViewHolder>() {

    private var list = listOf(
        CarInfo(text = "Только до 30 апреля"),
        CarInfo(text = "Только до 30 апреля"),
        CarInfo(text = "Только до 30 апреля")
    )

    inner class CarViewHolder(private val binding: ItemCircleCarBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(car: CarInfo) {
            binding.tvDate.text = car.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(ItemCircleCarBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}