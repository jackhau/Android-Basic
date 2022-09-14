package com.example.tranning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.example.tranning.model.Property


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.actionbar_toolbar)
        toolbar.title = "Main Activity"

        val clickMe: TextView = findViewById(R.id.click_me)

        val property = Property()
        property.propertyName = "Damasara"
        property.propertyLocation = "Petaling Jaya"

        clickMe.setOnClickListener {
            DetailActivity.start(this, property)
        }

        val mainFragment = MainFragment.newInstance("You are ...")
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, mainFragment)
            .commit()

    }
}