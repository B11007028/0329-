package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spGender = findViewById<Spinner>(R.id.spGender)
        val etAge = findViewById<EditText>(R.id.etAge)
        val btOK = findViewById<Button>(R.id.btOK)
        val tvR = findViewById<TextView>(R.id.tvR)

        btOK.setOnClickListener {
            val age = etAge.text.toString().toInt()

            if(spGender.selectedItemPosition == 0){
                when{// 男生
                     age <= 28 -> {
                         tvR.text = getString(R.string.no_hurry)
                     }
                     age >= 33 -> {
                         tvR.text = getString(R.string.get_married)
                     }
                     else -> {
                         tvR.text = getString(R.string.find_couple)
                     }
                 }
            }else{ //女生
                when{
                    age <= 25 -> {
                        tvR.text = getString(R.string.no_hurry)
                    }
                    age >= 30 -> {
                        tvR.text = getString(R.string.get_married)
                    }
                    else -> {
                        tvR.text = getString(R.string.find_couple)
                    }
                }
            }
        }
    }
}