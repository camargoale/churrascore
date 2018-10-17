package com.example.pvnan.churrascore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        GlideApp.with (this)
                .load("https://www.gannett-cdn.com/presto/2018/08/06/USAT/d7e9198a-b2fa-4ca6-b947-31c3751cc248-GettyImages-898660948.jpg?width=534&height=401&fit=bounds&auto=webp")
                .placeholder(R.mipmap.space)
                .into(imgLogo)

        Handler().postDelayed({
            val main = Intent(this, Main::class.java)
            startActivity(main)
            finish()
        }, 2000)
    }
}
