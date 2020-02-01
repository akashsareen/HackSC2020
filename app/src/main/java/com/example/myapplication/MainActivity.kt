package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    /* create a main screen */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        /* bigButton, when clicked will... */
        bigButton.setOnClickListener{
            d("daniel", "button was pressed!")
            /* connect to About Me activity */
            startActivity(Intent(this, AboutMe::class.java))
        }
    }
}

