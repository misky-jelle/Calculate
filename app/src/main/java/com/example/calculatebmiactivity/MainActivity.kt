package com.example.calculatebmiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirst: TextInputLayout
    lateinit var etFirst: TextInputEditText
    lateinit var tilSecond: TextInputLayout
    lateinit var etSecond: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnMultiply: Button
    lateinit var tvAns: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btnAdd)
        btnModulus = findViewById(R.id.btnModulus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnSubtract = findViewById(R.id.btnSubtract)
        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        tvAns=findViewById(R.id.tvAns)



        btnAdd.setOnClickListener {
            var num = etFirst.text.toString().toDouble()
            var num1 = etSecond.text.toString().toDouble()
            add(num, num1)
        }
        btnMultiply.setOnClickListener {
            var num = etFirst.text.toString().toDouble()
            var num1 = etSecond.text.toString().toDouble()
            multiply(num, num1)
        }
        btnSubtract.setOnClickListener {
            var num = etFirst.text.toString().toDouble()
            var num1 = etSecond.text.toString().toDouble()
            subtract(num, num1)
        }
        btnModulus.setOnClickListener {
            var num = etFirst.text.toString().toDouble()
            var num1 = etSecond.text.toString().toDouble()
            modulus(num, num1)
        }
    }
    fun add(num: Double, num1: Double) {
        var add=num+num1
        tvAns.text=add.toString()
    }
    fun modulus(num: Double, num1: Double) {
        var modulus=num%num1
        tvAns.text=modulus.toString()
    }
    fun subtract(num: Double, num1: Double) {
        var subtract=num-num1
        tvAns.text=subtract.toString()
    }
    fun multiply(num: Double, num1: Double) {
        var multiply=num * num1
        tvAns.text=multiply.toString()
    }

}




