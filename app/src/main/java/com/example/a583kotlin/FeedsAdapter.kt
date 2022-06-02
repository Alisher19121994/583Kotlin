package com.example.a583kotlin

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class FeedsAdapter(var context: Context, var feedsList: ArrayList<Feeds>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.feeds, parent, false)
        return FeedsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feeds = feedsList[position]

        if (holder is FeedsViewHolder) {
            holder.profile.setImageResource(feeds.profile)
            holder.video.setVideoURI(Uri.parse("android.resource://" + context.packageName + "/" + feeds.postsPhotos))
            holder.video.setOnClickListener {
                holder.video.start()
            }
            holder.fullname.text = feeds.fullname
            holder.ids.text = feeds.ids
        }

    }

    override fun getItemCount(): Int {
        return feedsList.size
    }

    inner class FeedsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var profile: ShapeableImageView = itemView.findViewById(R.id.feeds_profile_image_id)
        var video: VideoView = itemView.findViewById(R.id.feeds_posts_video_id)
        var fullname: TextView = itemView.findViewById(R.id.feeds_fullname_id)
        var ids: TextView = itemView.findViewById(R.id.feeds_ids_id)

    }
}