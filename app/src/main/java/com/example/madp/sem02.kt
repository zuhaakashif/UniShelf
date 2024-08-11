package com.example.madp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class sem02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem02)

        // Set up buttons
        val PROBButton: Button = findViewById(R.id.PROBButton)
        val dsButton: Button = findViewById(R.id.dsButton)
        val OPPButton: Button = findViewById(R.id.OPPButton)
        val DLDButton: Button = findViewById(R.id.DLDButton)
        val laButton: Button = findViewById(R.id.laButton)
        val AMButton: Button = findViewById(R.id.AMButton)
        val backButton: ImageButton = findViewById(R.id.backButton)


        PROBButton.setOnClickListener {
            val intent = Intent(this, PROB::class.java)
            startActivity(intent)
        }

        dsButton.setOnClickListener {
            val intent = Intent(this, DATABASE::class.java)
            startActivity(intent)
        }

        OPPButton.setOnClickListener {
            val intent = Intent(this, OPP::class.java)
            startActivity(intent)
        }

        DLDButton.setOnClickListener {
            val intent = Intent(this, DLD::class.java)
            startActivity(intent)
        }

        laButton.setOnClickListener {
            val intent = Intent(this, LINEAR::class.java)
            startActivity(intent)
        }
        AMButton.setOnClickListener {
            val intent = Intent(this, AM::class.java)
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
