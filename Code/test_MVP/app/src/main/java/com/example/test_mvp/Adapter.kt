package com.example.test_mvp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test_mvp.databinding.ReViewItemBinding

class Adapter : RecyclerView.Adapter<Holder>(){

    var listData = mutableListOf<Data>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ReViewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val member = listData[position]
        holder.setData(member)
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}

class Holder(val binding: ReViewItemBinding) : RecyclerView.ViewHolder(binding.root){
    fun setData(member: Data){
        binding.tvName.text = member.name
    }
}

