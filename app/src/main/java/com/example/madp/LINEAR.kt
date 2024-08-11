package com.example.madp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class LINEAR : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.res04)

        // Set up buttons
        val bookButton: Button = findViewById(R.id.bookButton)
        val hecCourseOutlineButton: Button = findViewById(R.id.hecCourseOutlineButton)
        val pastPapersButton: Button = findViewById(R.id.pastPapersButton)
        val notesButton: Button = findViewById(R.id.notesButton)
        val backButton: ImageButton = findViewById(R.id.backButton)


        bookButton.setOnClickListener {
            // Handle Book button click
        }

        hecCourseOutlineButton.setOnClickListener {
            // Handle HEC Course Outline button click
        }

        pastPapersButton.setOnClickListener {
            // Handle Past Papers button click
        }

        notesButton.setOnClickListener {
            // Handle Notes button click
        }
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)

        }
    }
}
