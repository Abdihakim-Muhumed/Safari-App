package com.dawncodes.safariapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // declare widget
    lateinit var textName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textName = findViewById(R.id.line1)

        textName.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity2::class .java)
            startActivity(intent)
        })
    }
}
