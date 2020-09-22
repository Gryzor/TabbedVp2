package com.marconcini.tabbedvp2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewPager2WithFragments()
    }

    private fun initViewPager2WithFragments() {
        val viewPager: ViewPager2 = findViewById(R.id.viewpager)
        val adapter = ExampleStateAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        val tabLayout: TabLayout = findViewById(R.id.tablayout)
        val names: Array<String> = arrayOf(
                "Fragment A",
                "Fragment B",
                "Fragment C",
                "Fragment D",
                "Fragment E",
                "Fragment F",
                "Fragment G",
                "Fragment H",
                "Fragment I",
                "Fragment J",
                "Fragment K",
                "Fragment L",
                "Fragment M",
                "Fragment N"
        )
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = names[position]
        }.attach()
    }
}