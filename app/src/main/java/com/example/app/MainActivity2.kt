package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.OnBackInvokedDispatcher
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity2 : FragmentActivity() {

    private lateinit var  adapter: NumberAdapter
    private lateinit var ViewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        adapter = NumberAdapter(this)
        ViewPager =  findViewById(R.id.pager)
        ViewPager. adapter = adapter
        this.onBackPressedDispatcher.addCallback(
            this, object : OnBackPressedCallback(true){
                override fun handleOnBackPressed() {
                    startActivity(Intent(this@MainActivity2, MainActivity::class.java))

                }
            }
        )

        onBackPressed()
    }

    override fun onBackPressed() {

        //super.onBackPressed()

    }
}