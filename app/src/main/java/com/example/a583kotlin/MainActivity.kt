package com.example.a583kotlin

import android.media.session.MediaController
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerViewFeeds: RecyclerView
    lateinit var recyclerViewStories: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerViewStories = findViewById(R.id.recyclerViewStories_id)
        recyclerViewStories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        getStoriesAdapter(dataOfStories())

        recyclerViewFeeds = findViewById(R.id.recyclerViewFeeds_id)
        recyclerViewFeeds.layoutManager = GridLayoutManager(this, 1)

        getFeedsAdapter(dataOfFeeds())

    }

    private fun dataOfStories(): ArrayList<Stories> {
        val storiesList: ArrayList<Stories> = ArrayList()
        storiesList.add(Stories(R.drawable.rasm, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm1, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm2, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm1, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm2, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm1, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm2, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm1, "Alisher"))
        storiesList.add(Stories(R.drawable.rasm2, "Alisher"))
        return storiesList
    }

    private fun getStoriesAdapter(stories: ArrayList<Stories>) {
        val adapter = StoriesAdapter(this, stories)
        recyclerViewStories.adapter = adapter
    }

    private fun dataOfFeeds(): ArrayList<Feeds> {
        val feedsList: ArrayList<Feeds> = ArrayList()
        feedsList.add(Feeds(R.drawable.rasm, "Alisher", "@alisher$154", R.raw.v1))
        feedsList.add(Feeds(R.drawable.rasm, "Alisher", "@alisher$154", R.raw.v1))
        feedsList.add(Feeds(R.drawable.rasm, "Alisher", "@alisher$154", R.raw.v1))
        feedsList.add(Feeds(R.drawable.rasm, "Alisher", "@alisher$154", R.raw.v1))
        feedsList.add(Feeds(R.drawable.rasm, "Alisher", "@alisher$154", R.raw.v1))
        feedsList.add(Feeds(R.drawable.rasm, "Alisher", "@alisher$154", R.raw.v1))
        return feedsList
    }

    private fun getFeedsAdapter(feed: ArrayList<Feeds>) {
        val adapter = FeedsAdapter(this, feed)
        recyclerViewFeeds.adapter = adapter
    }
}