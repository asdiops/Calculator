package com.example.calculator

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private var clickCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val textView: TextView = findViewById(R.id.my_text)
//        textView.text = "мой текст"

        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
//        button7.setOnClickListener {
//            clickCount++
//            textView.text = "Кнопка была нажата $clickCount раз"
//            }

        button7.setOnClickListener {
            Log.e("button_7_tag", "real massage 7")
        }

        button8.setOnClickListener {
            Log.d("button_8_tag", "real message 8")
        }
    }
}