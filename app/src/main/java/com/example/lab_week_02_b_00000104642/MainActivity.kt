package com.example.lab_week_02_b_00000104642

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        private const val COLOR_KEY = "COLOR_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorCodeInput = findViewById<EditText>(R.id.color_code_input_field)
        val submitButton = findViewById<Button>(R.id.submit_button)

        submitButton.setOnClickListener {
            val colorCode = colorCodeInput.text.toString().trim()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(COLOR_KEY, colorCode)
            startActivity(intent)   // masih pakai startActivity, belum pakai startForResult
        }
    }
}
