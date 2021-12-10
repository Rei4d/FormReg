package com.example.myform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myform.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var bindingClass: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        supportActionBar?.hide()
    }
}