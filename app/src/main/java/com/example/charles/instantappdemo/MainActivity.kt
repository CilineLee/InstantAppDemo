package com.example.charles.instantappdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.charles.instantappdemo.feature02.Feature02Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_feature01.setOnClickListener {
//            val intent = Intent(this, Feature01Activity::class.java)
//            startActivity(intent)
        }

        btn_feature02.setOnClickListener {
            val intent = Intent(this, Feature02Activity::class.java)
            startActivity(intent)
        }
    }
}
