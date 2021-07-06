package com.arksunexus.bootcampcolombia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var title: TextView
    private lateinit var name: EditText
    private lateinit var addBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = findViewById(R.id.title_text_view)
        name = findViewById(R.id.name_edit_text)
        addBtn = findViewById(R.id.add_button)

        addBtn.setOnClickListener {
            title.text = name.text
        }
    }
}