package com.example.myform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import com.example.myform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        supportActionBar?.hide()

        val adLog : String = "admin"
        val adPas : String = "123"

        bindingClass.logb.setOnClickListener {


                var logValue: String = bindingClass.login.text.toString()
                var passValue: String = bindingClass.password.text.toString()

                if ((logValue == adLog) && (passValue == adPas)) {

                    val intent = Intent(this, MainActivity2::class.java)
                    startActivity(intent)

                } else {


                }


        }
    }
}