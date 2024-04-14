package com.example.calculator

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {     //R.layout.activity_main

    private var clickCount: Int = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        val textView: TextView = findViewById(R.id.my_text)
//        textView.text = "мой текст"
        binding.myText.text= "мой текст"

        binding.myText.setOnClickListener {
            Log.e("b_tag", "real massage")
        }

//        val button7: Button = findViewById(R.id.button7)

        binding.button7.setOnClickListener {
            clickCount++
            binding.myText.text = "Кнопка была нажата $clickCount раз"
            if (binding.myText.visibility == View.VISIBLE) {
                binding.myText.visibility = View.INVISIBLE
            } else {
                binding.myText.visibility = View.VISIBLE
            }
        }

        //  --------   setOnClickListener Layouts (сверху-вниз)

        binding.button7.setOnClickListener {
            Log.e("button_7_tag", "real massage 7")
        }
        binding.button8.setOnClickListener {
            Log.d("button_8_tag", "real message 8")
        }
        binding.button9.setOnClickListener {
            Log.e("button_9_tag", "real message 9")
        }
        binding.buttonDelenie.setOnClickListener {
            Log.d("button_delenie_tag", "real message delenie")
        }


        binding.button4.setOnClickListener {
            Log.d("button_4_tag", "real message 4")
        }
        binding.button5.setOnClickListener {
            Log.e("button_5_tag", "real message 5")
        }
        binding.button6.setOnClickListener {
            Log.d("button_6_tag", "real message 6")
        }
        binding.buttonUmnozenie.setOnClickListener {
            Log.e("button_Umnozenie_tag", "real message Umnozenie")
        }


        binding.button1.setOnClickListener {
            Log.d("button_1_tag", "real message 1")
        }
        binding.button2.setOnClickListener {
            Log.e("button_2_tag", "real message 2")
        }
        binding.button3.setOnClickListener {
            Log.d("button_3_tag", "real message 3")
        }
        binding.buttonPlus.setOnClickListener {
            Log.e("button_plus_tag", "real message plus")
        }


        binding.button0.setOnClickListener {
            Log.d("button_0_tag]", "real message 0")
        }
        binding.buttonRavno.setOnClickListener {
            Log.e("button_Ravno_tag", "real message Ravno")
        }
        binding.buttonMinus.setOnClickListener {
            Log.d("button_Minus_tag", "real message Minus")
        }


        binding.buttonDelete.setOnClickListener {
            Log.e("button_Delete_tag", "real message Delete")
        }
        
    }
}