package com.example.task4

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun homelayoutButton(view: View) {
        setContentView(R.layout.secondlayout)
    }

    fun secondlayoutButton(view: View) {
        setContentView(R.layout.activity_main)
    }

}
