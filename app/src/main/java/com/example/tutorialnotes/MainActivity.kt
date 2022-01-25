package com.example.tutorialnotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


//TODO: can add todo notes like this!

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Main code to run first:
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    // When the button is clicked, the text needs to change
    // But we want to say "hello" to our user
    // So, we first take the name of the user, then change text to ("Hello" + name)
    fun onBtnClick(view: View){
        val txtStart: TextView = findViewById(R.id.startPageText)
        txtStart.text = "HELLO"
    }


}

// 55.43
// https://youtu.be/fis26HvvDII?t=3343