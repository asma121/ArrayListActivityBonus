package com.example.arraylistactivitybonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var et1:EditText
    lateinit var et2:EditText
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var textView: TextView
    lateinit var names:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1=findViewById(R.id.et1)
        et2=findViewById(R.id.et2)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)
        textView=findViewById(R.id.textView)
        names= arrayListOf()

        button.setOnClickListener {
            names.add("${et1.text}")
        }

        button2.setOnClickListener {
            if(et2.text.toString().toInt()<=names.size && et2.text.toString().toInt()>0){
                val p=et2.text.toString().toInt()-1
                textView.text=names[p]
            }else{
                Toast.makeText(this," there is no result ",Toast.LENGTH_LONG).show()
            }
        }
    }
}