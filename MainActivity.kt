package com.example.apppart1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.view.WindowManager


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        calculateButton.setOnClickListener {
            val inputEditText = findViewById<EditText>(R.id.input)
            val input = inputEditText.text.toString()
            val result = calculate(input)
            showPopup(result)
        }
    }

    private fun calculate(input: String): String {
        // Perform the calculation based on the input
        return if (input.equals("rice + water", ignoreCase = true)) {
            "Cooked Rice"
        } else if (input.equals("chicken + fire", ignoreCase = true)) {
            "Grilled Chicken"
        } else if (input.equals("water + cocoa", ignoreCase = true)) {
            "Chocolate Drink"
        } else if (input.equals("water + powder milk", ignoreCase = true)) {
            "Milk"
        } else if (input.equals("lamb + fire", ignoreCase = true)) {
            "Grilled Lamb"
        } else {
            "Invalid Calculation"
        }
    }

    private fun showPopup(result: String) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("Calculation Result")
        builder.setMessage(result)
        builder.setPositiveButton("OK", null)
        builder.create().show()
    }
}