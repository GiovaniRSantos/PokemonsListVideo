package com.example.recyclerview

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recyclerview.models.Video

class VideoAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<Video> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return LiveViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_live, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {
            is LiveViewHolder -> {
                holder.bind(items[position])
            }
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }


    fun setList(liveList: List<Video>) {
        this.items = liveList
    }

    class LiveViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val liveTitle = itemView.findViewById<TextView>(R.id.title)
        private val liveAuthor = itemView.findViewById<TextView>(R.id.author)
        private val liveThumbnail = itemView.findViewById<ImageView>(R.id.thumbnail)

        @SuppressLint("CheckResult")
        fun bind(live: Video) {
            liveTitle.text = live.title
            liveAuthor.text = live.author

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(live.thumbnailUrl)
                .into(liveThumbnail)
        }
    }

}