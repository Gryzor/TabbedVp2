package com.marconcini.tabbedvp2

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ExampleStateAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 14
    }

    override fun createFragment(position: Int): Fragment {
        Log.d("frg", "createFragment: $position")
        return when (position) {
            0 -> SomeFragment.newInstance("A")
            1 -> SomeFragment.newInstance("B")
            2 -> SomeFragment.newInstance("C")
            3 -> SomeFragment.newInstance("D")
            4 -> SomeFragment.newInstance("E")
            5 -> SomeFragment.newInstance("F")
            6 -> SomeFragment.newInstance("G")
            7 -> SomeFragment.newInstance("H")
            8 -> SomeFragment.newInstance("I")
            9 -> SomeFragment.newInstance("J")
            10 -> SomeFragment.newInstance("K")
            11 -> SomeFragment.newInstance("L")
            12 -> SomeFragment.newInstance("M")
            13 -> SomeFragment.newInstance("N")
            else -> SomeFragment.newInstance("0")
        }
    }
}