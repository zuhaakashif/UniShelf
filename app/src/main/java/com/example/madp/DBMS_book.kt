package com.example.madp

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class DBMS_book : AppCompatActivity() {
    private var isDarkMode = false // Track the current mode

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pdf_display)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val pageNumber = intent.getIntExtra("pageNumber", 0)

        val pdfView: PDFView = findViewById(R.id.pdfView)
        val parentLayout: ViewGroup = pdfView.parent as ViewGroup

        parentLayout.setBackgroundColor(Color.parseColor("#CFBFB3"))

        pdfView.fromAsset("DBSM-BOOK.pdf")
            .defaultPage(pageNumber)
            .enableSwipe(true)
            .swipeHorizontal(true)
            .scrollHandle(DefaultScrollHandle(this))
            .enableAntialiasing(true)
            .spacing(0)
            .pageFling(true)
            .load()

        val btnMode: Button = findViewById(R.id.btn_mode)
        btnMode.setOnClickListener {
            toggleMode(pdfView, parentLayout, btnMode)
        }
    }

    private fun toggleMode(pdfView: PDFView, parentLayout: ViewGroup, btnMode: Button) {
        if (isDarkMode) {
            // Switch to light mode
            parentLayout.setBackgroundColor(Color.parseColor("#CFBFB3"))
            pdfView.setBackgroundColor(Color.WHITE)
            pdfView.setNightMode(false)
            btnMode.text = "Dark Mode"
        } else {
            // Switch to dark mode
            parentLayout.setBackgroundColor(Color.BLACK)
            pdfView.setBackgroundColor(Color.BLACK)
            pdfView.setNightMode(true)
            btnMode.text = "Light Mode"
        }
        isDarkMode = !isDarkMode
    }
}
