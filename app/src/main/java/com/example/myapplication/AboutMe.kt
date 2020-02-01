package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AboutMe: AppCompatActivity() {

    /* on the creation */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* set page layout*/
        setContentView(R.layout.activity_about_me)
    }

}