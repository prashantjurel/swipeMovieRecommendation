package com.prashant.myapplication

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class CardStackAdapter(addList: MutableList<MovieDetails>) : RecyclerView.Adapter<CardStackAdapter.CardStackViewHolder>() {

    private var items: MutableList<MovieDetails> = addList

    class CardStackViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var movieAlbumArt: ImageView? = itemView.findViewById(R.id.movie_album_art)
        var movieNameYear: TextView? = itemView.findViewById(R.id.movie_name_year)
        val rating: TextView? = itemView.findViewById(R.id.movie_rating)
        val tags: TextView? = itemView.findViewById(R.id.movie_tags)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardStackViewHolder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.cardview_layout,parent,false)
        return CardStackViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardStackViewHolder, position: Int) {
        var data: MovieDetails? = items?.get(position)
        Picasso.get().load(data?.movieAlbumArt.toString()).into(holder.movieAlbumArt)
        holder.movieNameYear?.text = data?.name + ", "+data?.year
        holder.rating?.text = data?.rating
        holder.tags?.text = data?.tags

    }

    override fun getItemCount(): Int {
        return items?.size ?: 0
    }

}