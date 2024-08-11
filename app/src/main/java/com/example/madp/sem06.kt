package com.example.madp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class sem06 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem06)

        // Set up buttons
        val MADButton: Button = findViewById(R.id.MADButton)
        val TWButton: Button = findViewById(R.id.TWButton)
        val CNButton: Button = findViewById(R.id.CNButton)
        val CVButton: Button = findViewById(R.id.CVButton)
        val AIButton: Button = findViewById(R.id.AIButton)
        val backButton: ImageButton = findViewById(R.id.backButton)


        MADButton.setOnClickListener {
            val intent = Intent(this, MAD::class.java)
            startActivity(intent)
        }

        TWButton.setOnClickListener {
            val intent = Intent(this, TW::class.java)
            startActivity(intent)
        }

        CNButton.setOnClickListener {
            val intent = Intent(this, CN::class.java)
            startActivity(intent)
        }

        CVButton.setOnClickListener {
            val intent = Intent(this, CV::class.java)
            startActivity(intent)
        }

        AIButton.setOnClickListener {
            val intent = Intent(this, AI::class.java)
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
