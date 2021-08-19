package com.prashant.myapplication.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("image")
fun loadImage(view: ImageView, url: String) {
    view.contentDescription = url
}