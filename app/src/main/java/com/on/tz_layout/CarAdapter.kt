package com.on.tz_layout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.on.tz_layout.databinding.ItemCarInfoBinding
import com.on.tz_layout.databinding.ItemProductsBinding

class CarAdapter(val onClick: () -> Unit) : Adapter<CarAdapter.CarViewHolder>() {

    private var list = listOf(
        Car(text = "54 000km"),
        Car(text = "54 000km"),
        Car(text = "54 000km")
    )

    inner class CarViewHolder(private val binding: ItemCarInfoBinding) : ViewHolder(binding.root) {
        fun onBind(car: Car) {
            binding.tvKmCenter.text = car.text

            binding.btmCreateEvent.setOnClickListener {
                onClick()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(
            ItemCarInfoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}

class ProductAdapter() : Adapter<ProductAdapter.CarViewHolder>() {

    private var list = listOf(
        Car(text = "Рекомендуемые товары"),
        Car(text = "Рекомендуемые товары"),
        Car(text = "Рекомендуемые товары")
    )

    inner class CarViewHolder(private val binding: ItemProductsBinding) : ViewHolder(binding.root) {
        fun onBind(car: Car) {
            binding.tvRec.text = car.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(
            ItemProductsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}