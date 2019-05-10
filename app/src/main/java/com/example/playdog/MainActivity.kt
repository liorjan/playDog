package com.example.playdog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenActivity : Button = findViewById(R.id.gowalk)
        btnOpenActivity.setOnClickListener {
            val intent = Intent(this, GoWalkActivity :: class.java)
            startActivity(intent)
        }

    }
}
