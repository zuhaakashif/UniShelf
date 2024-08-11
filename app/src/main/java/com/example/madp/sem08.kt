package com.example.madp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class sem08 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem08)

        // Set up buttons
        val infoSecurityButton: Button = findViewById(R.id.infoSecurityButton)
        val businessButton: Button = findViewById(R.id.businessButton)
        val bigDataButton: Button = findViewById(R.id.bigDataButton)
        val backButton: ImageButton = findViewById(R.id.backButton)


        infoSecurityButton.setOnClickListener {
            val intent = Intent(this, InfoSecurityDetailsActivity::class.java)
            startActivity(intent)

        }

        businessButton.setOnClickListener {
            val intent = Intent(this, business::class.java)
            startActivity(intent)
        }

        bigDataButton.setOnClickListener {
            val intent = Intent(this, bigdata::class.java)
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
