package com.example.proyecto


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlin.random.Random
import kotlin.system.exitProcess

var upp = ArrayList<Int>()
var down = ArrayList<Int>()
var turno: String = ""
var mias = ArrayList<Int>()
var tuyas = ArrayList<Int>()
var hitsB =0
var hits =0
class SinglePlayer : AppCompatActivity() {

    private lateinit var selector: Select
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_player)
        PosiBot()
        selector = findViewById(R.id.selectC)
        selector.setOnSelectedListener { select ->
            if(!upp.contains(select)){
                playNow(select)
                checkwinner()
            }
        }
    }


    fun playNow(currCell: Int) {
        upp.add(currCell)
        mias.add(currCell)
        if(tuyas.contains(currCell)){
            hits++
        }
        down.add(retornaRandomDisponible())

    }
    fun checkwinner(){

        if(hitsB==15){
            val build = AlertDialog.Builder(this)
            build.setTitle("Game Over")
            build.setMessage("Perdiste ")
            build.setPositiveButton("ok"){dialog, which ->
                exitProcess(1)
            }
            Handler().postDelayed({build.show()},500)
        }
        if(hits==15){
            val build = AlertDialog.Builder(this)
            build.setTitle("Game Over")
            build.setMessage("Ganaste ")
            build.setPositiveButton("ok"){dialog, which ->
                exitProcess(1)
            }
            Handler().postDelayed({build.show()},500)
        }
    }

    fun disponible(num: Int, lista: ArrayList<Int>): Boolean {
        return !lista.contains(num)
    }
    fun retornaRandomDisponible():Int{
        while (true){
            val num= (Math.random() * 100) + 1;
            if(disponible(num.toInt(), down)){
                if(todo2.contains(num.toInt())){
                    hitsB++
                }
                return num.toInt()
            }
        }
    }



    fun PosiBot() {
        while (tuyas.size < 15) {
            var num = (Math.random() * 100) + 1;
            if(tuyas.isEmpty()){
                tuyas.add(num.toInt())
            }
            else if(disponible(num.toInt(), tuyas)) {
                tuyas.add(num.toInt())

            }
        }
    }
}