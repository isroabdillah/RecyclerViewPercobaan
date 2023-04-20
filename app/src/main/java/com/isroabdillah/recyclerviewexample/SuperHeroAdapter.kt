package com.isroabdillah.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperHeroAdapter(private val list: ArrayList<SuperHero>) : RecyclerView.Adapter<SuperHeroAdapter.SuperHeroViewHolder>() {

    class SuperHeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_desc)
    }

//    inner class SuperHeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//        fun bind(superHero: SuperHero){
//            with(itemView){
//                tv_name.text = superHero.name
//                tv_desc.text = superHero.desc
//            }
//        }
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_superhero, parent, false)
        return SuperHeroViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
//        holder.bind(list[position])
        val (name, description) = list[position]
        holder.tvName.text = name
        holder.tvDescription.text = description
    }

    override fun getItemCount(): Int = list.size

}