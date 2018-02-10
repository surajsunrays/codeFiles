package com.example.shweta.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calci.*

class CalciActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calci)
        val result = findViewById(R.id.result) as TextView
        val btn_add = findViewById(R.id.btn_add) as Button
        val btn_sub = findViewById(R.id.btn_sub) as Button
        val btn_mult = findViewById(R.id.btn_mult) as Button
        val btn_div = findViewById(R.id.btn_div) as Button
        val btn_sq = findViewById(R.id.btn_sq) as Button
        val btn_cube = findViewById(R.id.btn_cube) as Button

        btn_add.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() + getNum2()).toString()
        })
        btn_sub.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() - getNum2()).toString()
        })
        btn_mult.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() * getNum2()).toString()
        })
        btn_div.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() / getNum2()).toString()
        })
        btn_sq.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() * getNum1()).toString()
        })
        btn_cube.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() * getNum1() * getNum1()).toString()
        })

    }
    fun getNum1(): Int{
            val input_num1 = findViewById(R.id.edt_num1) as EditText
            return Integer.parseInt(input_num1.text.toString())
        }
    fun getNum2(): Int{
        val input_num2 = findViewById(R.id.edt_num2) as EditText
        return Integer.parseInt(input_num2.text.toString())
    }
}

