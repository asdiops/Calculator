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

    var firstNumber: Int? = null
    var operator: Operators? = null
    var secondNumder: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val input = binding.mainText

        val text: String = binding.button1.text.toString()


        // -------   setOnClickListener buttons

        binding.buttonDelete.setOnClickListener {
            input.text = input.text.dropLast(1)
        }
        binding.buttonRavno.setOnClickListener {

        }

        binding.buttonPlus.setOnClickListener {
            input.text = input.text.toString() + binding.buttonPlus.text.toString()
        }
        binding.buttonMinus.setOnClickListener {
            input.text = input.text.toString() + binding.buttonMinus.text.toString()
        }
        binding.buttonUmnozenie.setOnClickListener {
            input.text = input.text.toString() + binding.buttonUmnozenie.text.toString()
        }
        binding.buttonDelenie.setOnClickListener {
            input.text = input.text.toString() + binding.buttonDelenie.text.toString()
        }

        binding.button1.setOnClickListener {
            input.text = input.text.toString() + binding.button1.text.toString()
        }
        binding.button2.setOnClickListener {
            input.text = input.text.toString() + binding.button2.text.toString()
        }
        binding.button3.setOnClickListener {
            input.text = input.text.toString() + binding.button3.text.toString()
        }
        binding.button4.setOnClickListener {
            input.text = input.text.toString() + binding.button4.text.toString()
        }
        binding.button5.setOnClickListener {
            input.text = input.text.toString() + binding.button5.text.toString()
        }
        binding.button6.setOnClickListener {
            input.text = input.text.toString() + binding.button6.text.toString()
        }
        binding.button7.setOnClickListener {
            input.text = input.text.toString() + binding.button7.text.toString()
        }
        binding.button8.setOnClickListener {
            input.text = input.text.toString() + binding.button8.text.toString()
        }
        binding.button9.setOnClickListener {
            input.text = input.text.toString() + binding.button9.text.toString()
        }
        binding.button0.setOnClickListener {
            input.text = input.text.toString() + binding.button0.text.toString()
        }

    }
}

enum class Operators {
    PLUS,
    MINUS
}