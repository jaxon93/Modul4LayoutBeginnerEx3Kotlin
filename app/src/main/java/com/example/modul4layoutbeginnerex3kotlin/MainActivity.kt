package com.example.modul4layoutbeginnerex3kotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var tv_user_id_print: TextView
    lateinit var tv_user_pw_print: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        val et_user_id = findViewById<EditText>(R.id.et_user_id)
        val et_user_pw = findViewById<EditText>(R.id.et_user_pw)
        tv_user_id_print = findViewById<TextView>(R.id.tv_user_id_print)
        tv_user_pw_print = findViewById<TextView>(R.id.tv_user_pw_print)
        val b_login = findViewById<Button>(R.id.b_login)
        b_login.setOnClickListener {
            printOnConsole(et_user_id, et_user_pw)
        }
    }

    fun printOnConsole(et_user_id: EditText, et_user_pw: EditText) {
        Log.d("User ID ", et_user_id.text.toString())
        Log.d("User PW ", et_user_pw.text.toString())
        tv_user_id_print!!.text = et_user_id.text
        tv_user_pw_print!!.text = et_user_pw.text
    }
}