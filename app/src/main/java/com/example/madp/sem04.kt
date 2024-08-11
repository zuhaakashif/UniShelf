package com.example.madp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class sem04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem04)

        // Set up buttons
        val DAAButton: Button = findViewById(R.id.DAAButton)
        val LAButton: Button = findViewById(R.id.LAButton)
        val SButton: Button = findViewById(R.id.SButton)
        val TOAButton: Button = findViewById(R.id.TOAButton)
        val DSButton: Button = findViewById(R.id.DSButton)
        val PSButton: Button = findViewById(R.id.PSButton)
        val backButton: ImageButton = findViewById(R.id.backButton)

        DAAButton.setOnClickListener {
            val intent = Intent(this, DAA::class.java)
            startActivity(intent)
            // Handle Information Security button click
        }

        LAButton.setOnClickListener {
            val intent = Intent(this, LA::class.java)
            startActivity(intent)
        }

        SButton.setOnClickListener {
            val intent = Intent(this, Sociology::class.java)
            startActivity(intent)
        }

        TOAButton.setOnClickListener {
            val intent = Intent(this, TOA::class.java)
            startActivity(intent)
        }

        DSButton.setOnClickListener {
            val intent = Intent(this, DS::class.java)
            startActivity(intent)
        }
        PSButton.setOnClickListener {
            val intent = Intent(this, PS::class.java)
            startActivity(intent)
        }
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}
