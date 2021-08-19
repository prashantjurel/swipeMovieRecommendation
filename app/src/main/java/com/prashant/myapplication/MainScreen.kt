package com.prashant.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator

import android.view.animation.LinearInterpolator
import com.yuyakaido.android.cardstackview.*


class MainScreen : AppCompatActivity() {

    private var manager: CardStackLayoutManager? = null
    private var adapter: CardStackAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        val moviesList: CardStackView = findViewById(R.id.stack_view)
        adapter = CardStackAdapter(addList())
        manager = CardStackLayoutManager(this,CardStackListener.DEFAULT)
        manager!!.setStackFrom(StackFrom.None)
        manager!!.setVisibleCount(3)
        manager!!.setTranslationInterval(8.0f)
        manager!!.setScaleInterval(0.95f)
        manager!!.setSwipeThreshold(0.3f)
        manager!!.setMaxDegree(20.0f)
        manager!!.setDirections(Direction.FREEDOM)
        manager!!.setCanScrollHorizontal(true)
        manager!!.setSwipeableMethod(SwipeableMethod.Manual)
        manager!!.setOverlayInterpolator(LinearInterpolator())
        moviesList.layoutManager = manager
        moviesList.adapter = adapter
        moviesList.itemAnimator = DefaultItemAnimator()
    }


    private fun addList(): MutableList<MovieDetails> {
        val items: MutableList<MovieDetails> = ArrayList()
        items?.add(MovieDetails("Rockstar", "2011", "ABC","DEF","7.1","https://i.imgur.com/7tM3IaT.jpg","abc","Romantic,Drama,Dark"))
        items?.add(MovieDetails("Katha", "1983", "ABC","DEF","7.2","https://i.imgur.com/2OLD5XL.jpg","abc","Romantic,Old,Funny"))
        items?.add(MovieDetails("Malik", "201", "ABC","DEF","8.3","https://i.imgur.com/jVzsgXd.jpg","abc","Drama,Dark,Thriller"))
        items?.add(MovieDetails("Rockstar", "2011", "ABC","DEF","7.1","https://i.imgur.com/7tM3IaT.jpg","abc","Romantic,Drama,Dark"))
        items?.add(MovieDetails("Katha", "1983", "ABC","DEF","7.2","https://i.imgur.com/2OLD5XL.jpg","abc","Romantic,Old,Funny"))
        items?.add(MovieDetails("Malik", "201", "ABC","DEF","8.3","https://i.imgur.com/jVzsgXd.jpg","abc","Drama,Dark,Thriller"))
        items?.add(MovieDetails("Rockstar", "2011", "ABC","DEF","7.1","https://i.imgur.com/7tM3IaT.jpg","abc","Romantic,Drama,Dark"))
        items?.add(MovieDetails("Katha", "1983", "ABC","DEF","7.2","https://i.imgur.com/2OLD5XL.jpg","abc","Romantic,Old,Funny"))
        items?.add(MovieDetails("Malik", "201", "ABC","DEF","8.3","https://i.imgur.com/jVzsgXd.jpg","abc","Drama,Dark,Thriller"))

        return items
    }
}


