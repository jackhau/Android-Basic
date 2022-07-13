package com.example.tranning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.actionbar_toolbar)
        toolbar.title = "Main Activity"

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, MainFragment())
            .commit()

    }
}