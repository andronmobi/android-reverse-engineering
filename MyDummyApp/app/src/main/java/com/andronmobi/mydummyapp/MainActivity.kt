package com.andronmobi.mydummyapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    companion object {
        val imageUrl = "https://github.com/andronmobi/android-reverse-engineering/raw/master/images/android.png"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageView = findViewById<ImageView>(R.id.imageView)
        GlideApp.with(this).load(imageUrl).into(imageView)
    }
}
