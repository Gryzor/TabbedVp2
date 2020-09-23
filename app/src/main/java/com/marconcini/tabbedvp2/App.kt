package com.marconcini.tabbedvp2

import android.app.Application
import androidx.fragment.app.FragmentManager

class App : Application() {

    @androidx.fragment.app.FragmentStateManagerControl
    override fun onCreate() {
        super.onCreate()
        FragmentManager.enableNewStateManager(true)
    }
}