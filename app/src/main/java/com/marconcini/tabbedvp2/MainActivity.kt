package com.marconcini.tabbedvp2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewPager2WithFragments()
        button.setOnClickListener { viewPager.setCurrentItem(10, true) }
    }

    private fun initViewPager2WithFragments() {
        viewPager = findViewById(R.id.viewpager)
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
            "Fragment N",
            "Fragment O",
            "Fragment P",
            "Fragment Q",
            "Fragment R",
            "Fragment S",
            "Fragment T",
            "Fragment U",
        )
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = names[position]
        }.attach()
    }
}