package com.example.tranning

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tranning.databinding.ActivityDetailBinding
import com.example.tranning.model.Employee
import com.example.tranning.model.Programmer
import com.example.tranning.model.Property

class DetailActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityDetailBinding

    companion object {
        const val PROPERTY = "PROPERTY"
        fun start(context: Context, property: Property) {
            val starter = Intent(context, DetailActivity::class.java)
            starter.putExtra(PROPERTY, property)
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        normal setContentView
//        setContentView(R.layout.activity_detail)

        //databinding setContentView
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail)

        //get intent object from previous page
        val property = intent.getParcelableExtra<Property>(PROPERTY)

        //set the object into xml with databinding
        mBinding.data = property
    }
}