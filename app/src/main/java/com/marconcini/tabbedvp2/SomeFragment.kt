package com.marconcini.tabbedvp2

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

class SomeFragment : Fragment() {

    var TAG = "frg 0"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        TAG = "frg ${arguments?.getString("CATEGORY")}"
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_some, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).apply {
            text = arguments?.getString("CATEGORY", "") ?: "not found"
        }
    }

    override fun onStart() {
        Log.d(TAG, "onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop()")
        super.onStop()
    }

    companion object {

        fun newInstance(
            categoryName: String
        ) = SomeFragment().apply {
            arguments = bundleOf(
                "CATEGORY" to categoryName
            )
        }
    }
}