package com.hari.mywishlistapp

import android.app.Application
import com.hari.mywishlistapp.data.Graph

class WishListApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }

}