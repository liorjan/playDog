package com.example.playdog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GoWalkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_walk)

        val walking : TextView = findViewById(R.id.walking)
        walking.setText("GoWalk!")

    }
}
