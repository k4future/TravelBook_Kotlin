package com.hegsam.travelbook.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hegsam.travelbook.databinding.RecyclerRowBinding
import com.hegsam.travelbook.model.Place
import com.hegsam.travelbook.view.MapsActivity

/**
 * Created by Salih ÇABUK on 8.09.2021.
 */
class RVAdapter(val placeList: List<Place>) : RecyclerView.Adapter<RVAdapter.PlaceHolder>() {
    class PlaceHolder (val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceHolder {
        val recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PlaceHolder(recyclerRowBinding)
    }

    override fun onBindViewHolder(holder: PlaceHolder, position: Int) {
        holder.binding.recyclerViewtextView.text = placeList.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,MapsActivity::class.java)
            intent.putExtra("selectedPlace",placeList.get(position))
            intent.putExtra("info","old")
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return placeList.size
    }
}