package com.example.madp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class DLD: AppCompatActivity() {
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
            val intent = Intent(this, DLD_book::class.java)
            startActivity(intent)
        }

        hecCourseOutlineButton.setOnClickListener {
            val intent = Intent(this, HEC::class.java)
            startActivity(intent)
        }

        pastPapersButton.setOnClickListener {
            val intent = Intent(this, DBMS_past::class.java)
            startActivity(intent)
        }

        notesButton.setOnClickListener {
            val intent = Intent(this, DBMS_notes::class.java)
            startActivity(intent)
        }
        backButton.setOnClickListener {
            val intent = Intent(this, sem02::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)

        }
    }
}
