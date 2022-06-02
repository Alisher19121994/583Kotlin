package com.example.a583kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class StoriesAdapter(var context: Context, var storiesList: ArrayList<Stories>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.stories, parent, false)
        return StoriesViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val stories = storiesList[position]
        if (holder is StoriesViewHolder) {
            holder.profile.setImageResource(stories.profile)
            holder.fullname.text = stories.fullname
        }
    }

    override fun getItemCount(): Int = storiesList.size

    inner class StoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile: ShapeableImageView = itemView.findViewById(R.id.stories_image_id)
        val fullname: TextView = itemView.findViewById(R.id.stories_fullname_id)
    }
}