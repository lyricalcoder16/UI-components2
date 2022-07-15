package com.charles.uicomponents2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ProgressBarCircular: ProgressBar = findViewById(R.id.progressBarCircular)
        val ProgressBarHorizontal : ProgressBar  = findViewById(R.id.progressBarVertical)
        val StartButton: Button = findViewById(R.id.StartButton)
        val ScrollButton: Button = findViewById(R.id.buttonscroll)
        StartButton.setOnClickListener {
            if(ProgressBarCircular.isVisible){
                ProgressBarCircular.visibility = View.GONE
                ProgressBarHorizontal.visibility = View.GONE
            }else{
                ProgressBarCircular.visibility = View.VISIBLE
                ProgressBarHorizontal.visibility = View.VISIBLE
            }
        }
        ScrollButton.setOnClickListener {
            val intent=Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}