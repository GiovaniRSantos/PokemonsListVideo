package com.example.recyclerview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var liveAdapter: VideoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        addDataSource()
    }

    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        this.liveAdapter.setList(dataSource)
    }

    private fun initRecyclerView() {
        this.liveAdapter = VideoAdapter { video ->
            openVideo(video.link)
        }

        recyclerview.apply {
            recyclerview.adapter = liveAdapter
        }
    }

    private fun openVideo(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}