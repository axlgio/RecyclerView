package com.example.s5_ejercicio_recyclerview
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.s5_ejercicio_recyclerview.databinding.ItemMenuBinding

class MenuAdapter(private val list: List<MenuItem>) :
    RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val binding = ItemMenuBinding.inflate(LayoutInflater.from(parent.context))
        return MenuViewHolder(binding)
    }
    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        with(holder) {
            view.tvTitle.text = list[position].title
            view.tvAno.text = list[position].ano
            Glide.with(view.root)
                .load(list[position].image)
                .into(view.ivImage)
        }
    }
    override fun getItemCount(): Int = list.size
    class MenuViewHolder(private val binding: ItemMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val view = binding
    }
}