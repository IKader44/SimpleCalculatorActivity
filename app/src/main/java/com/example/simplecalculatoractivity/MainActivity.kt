package com.example.simplecalculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow
import kotlin.math.sqrt


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextInput1 = findViewById<EditText>(R.id.editTextInput1)

        var editTextInput2 = findViewById<EditText>(R.id.editTextInput2)

        val buttonAdd = findViewById<Button>(R.id.btnAdd)
        val buttonSubtract = findViewById<Button>(R.id.btnSubtract)
        val buttonMultiply = findViewById<Button>(R.id.btnMultiply)
        val buttonDivide = findViewById<Button>(R.id.btnDivide)
        val buttonSqroot = findViewById<Button>(R.id.btnSquare)
        val buttonPower = findViewById<Button>(R.id.btnPower)
        val displayResult = findViewById<TextView>(R.id.displayResult)

        fun rootANumber(a: Double): Double {
            return sqrt(a)
        }
        fun pow2ANumber(a: Double): Double {
            return a
        }

        fun getInputFirst(): Int = Integer.parseInt(editTextInput1.text.toString())

        //Addition
        buttonAdd?.setOnClickListener{
        Toast.makeText(this@MainActivity,"Button Clicked",Toast.LENGTH_LONG)
            var editTextInput1 = editTextInput1.text.toString().toInt()
            var editTextInput2 = editTextInput2.text.toString().toInt()
            var total : Number
            total = editTextInput1 + editTextInput2

            displayResult.text = "${editTextInput1} + ${editTextInput2} = ${total}!" }

        //Subtraction
        buttonSubtract?.setOnClickListener {
            Toast.makeText(this@MainActivity,"Button Clicked", Toast.LENGTH_LONG)
            var editTextInput1 = editTextInput1.text.toString().toInt()
            var editTextInput2 = editTextInput2.text.toString().toInt()
            var total : Number
            total = editTextInput1 - editTextInput2

            displayResult.text = "${editTextInput1} - ${editTextInput2} = ${total}!"
        }

        //Multiplication
        buttonMultiply?.setOnClickListener {
            Toast.makeText(this@MainActivity,"Button Clicked", Toast.LENGTH_LONG)
            var editTextInput1 = editTextInput1.text.toString().toInt()
            var editTextInput2 = editTextInput2.text.toString().toInt()
            var total : Number
            total = editTextInput1 * editTextInput2

            displayResult.text = "${editTextInput1} * ${editTextInput2} = ${total}!"
        }

        //Divide
        buttonDivide?.setOnClickListener {
            Toast.makeText(this@MainActivity,"Button Clicked", Toast.LENGTH_LONG)
            var editTextInput1 = editTextInput1.text.toString().toInt()
            var editTextInput2 = editTextInput2.text.toString().toInt()
            if (editTextInput1 == 0 || editTextInput2 == 0)
            {

                displayResult.text = "Cannot divide by 0, select another number"
            }

            else
            {
                val total = editTextInput1 / editTextInput2
                displayResult.text = "${editTextInput1} / ${editTextInput2} = ${total}!"
            }
        }

        //Square-Root
        buttonSqroot?.setOnClickListener {
            try {
                displayResult.text = ("Root: ${rootANumber(getInputFirst().toDouble())}")
            }
            catch (nfe:NumberFormatException)
            {
                Toast.makeText(this@MainActivity, "Please check al fields", Toast.LENGTH_SHORT).show()
            }
        }

        //PowerTo
        buttonPower?.setOnClickListener {
            try
            {
               displayResult.text = ("pow2: ${pow2ANumber(getInputFirst().toDouble().pow(2.0))}")
            }
            catch (nfe:NumberFormatException)
            {
                Toast.makeText(this@MainActivity, "Please check all fields", Toast.LENGTH_LONG).show()
            }
        }
    }
}

