package com.example.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

var singleUser = false
class MenuActivity : AppCompatActivity() {

    lateinit var singlePlayerBtn: Button
    lateinit var multiPlayerBtn: Button
    lateinit var score: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        singlePlayerBtn = findViewById(R.id.idBtnSinglePlayer)
        multiPlayerBtn = findViewById(R.id.idBtnMultiPlayer)
        score = findViewById(R.id.idBtnScpre)
        singlePlayerBtn.setOnClickListener {
            singleUser = true
            startActivity(Intent(this,colocar2::class.java))
        }
        multiPlayerBtn.setOnClickListener {
            singleUser = false
            startActivity(Intent(this,OnlineCodeGeneratorActivity::class.java))
        }
        score.setOnClickListener {

            startActivity(Intent(this,ScoreActivity::class.java))
        }
    }
}