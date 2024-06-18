package com.example.puffandpoof.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.puffandpoof.databinding.DollListBinding
import com.example.puffandpoof.model.Doll

class DollAdap(private var dolls: List<Doll>, private val listener: OnItemClickListener) : RecyclerView.Adapter<DollAdap.DollViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DollViewHolder {
        val binding = DollListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DollViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DollViewHolder, position: Int) {
        val currentDoll = dolls[position]
        holder.bind(currentDoll)
    }

    override fun getItemCount() = dolls.size

    fun updateData(newDolls: List<Doll>) {
        dolls = newDolls
        notifyDataSetChanged()
    }

    inner class DollViewHolder(private val binding: DollListBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(position)
                }
            }
        }

        fun bind(doll: Doll) {
            Glide.with(binding.imgdoll.context).load(doll.imageLink).into(binding.imgdoll)
            binding.ttldol.text = doll.name
            binding.pricez.text = doll.price
//            binding.rating.text = doll.rating
            binding.size.text = doll.size
            binding.brand.text =doll.brand
        }
    }

    fun getItemAtPosition(position: Int): Doll {
        return dolls[position]
    }
}







