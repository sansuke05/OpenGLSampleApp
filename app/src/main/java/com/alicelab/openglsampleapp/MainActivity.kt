package com.alicelab.openglsampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), MainFragment.GraphicRenderFragmentListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val mainFragment = MainFragment()
        fragmentTransaction.add(R.id.container, mainFragment)
        fragmentTransaction.commit()
    }
}