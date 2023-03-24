package com.example.proyecto

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.collections.ArrayList

import kotlin.system.exitProcess
var todo = ArrayList<Int>()
class Colocar : AppCompatActivity() {

    lateinit var box1Btn: Button
    lateinit var box2Btn: Button
    lateinit var box3Btn: Button
    lateinit var box4Btn: Button
    lateinit var box5Btn: Button
    lateinit var box6Btn: Button
    lateinit var box7Btn: Button
    lateinit var box8Btn: Button
    lateinit var box9Btn: Button
    lateinit var box10Btn: Button
    lateinit var box11Btn: Button
    lateinit var box12Btn: Button
    lateinit var box13Btn: Button
    lateinit var box14Btn: Button
    lateinit var box15Btn: Button
    lateinit var box16Btn: Button
    lateinit var box17Btn: Button
    lateinit var box18Btn: Button
    lateinit var box19Btn: Button
    lateinit var box20Btn: Button
    lateinit var box21Btn: Button
    lateinit var box22Btn: Button
    lateinit var box23Btn: Button
    lateinit var box24Btn: Button
    lateinit var box25Btn: Button
    lateinit var box26Btn: Button
    lateinit var box27Btn: Button
    lateinit var box28Btn: Button
    lateinit var box29Btn: Button
    lateinit var box30Btn: Button
    lateinit var box31Btn: Button
    lateinit var box32Btn: Button
    lateinit var box33Btn: Button
    lateinit var box34Btn: Button
    lateinit var box35Btn: Button
    lateinit var box36Btn: Button
    lateinit var box37Btn: Button
    lateinit var box38Btn: Button
    lateinit var box39Btn: Button
    lateinit var box40Btn: Button
    lateinit var box41Btn: Button
    lateinit var box42Btn: Button
    lateinit var box43Btn: Button
    lateinit var box44Btn: Button
    lateinit var box45Btn: Button
    lateinit var box46Btn: Button
    lateinit var box47Btn: Button
    lateinit var box48Btn: Button
    lateinit var box49Btn: Button
    lateinit var box50Btn: Button
    lateinit var box51Btn: Button
    lateinit var box52Btn: Button
    lateinit var box53Btn: Button
    lateinit var box54Btn: Button
    lateinit var box55Btn: Button
    lateinit var box56Btn: Button
    lateinit var box57Btn: Button
    lateinit var box58Btn: Button
    lateinit var box59Btn: Button
    lateinit var box60Btn: Button
    lateinit var box61Btn: Button
    lateinit var box62Btn: Button
    lateinit var box63Btn: Button
    lateinit var box64Btn: Button
    lateinit var box65Btn: Button
    lateinit var box66Btn: Button
    lateinit var box67Btn: Button
    lateinit var box68Btn: Button
    lateinit var box69Btn: Button
    lateinit var box70Btn: Button
    lateinit var box71Btn: Button
    lateinit var box72Btn: Button
    lateinit var box73Btn: Button
    lateinit var box74Btn: Button
    lateinit var box75Btn: Button
    lateinit var box76Btn: Button
    lateinit var box77Btn: Button
    lateinit var box78Btn: Button
    lateinit var box79Btn: Button
    lateinit var box80Btn: Button
    lateinit var box81Btn: Button
    lateinit var box82Btn: Button
    lateinit var box83Btn: Button
    lateinit var box84Btn: Button
    lateinit var box85Btn: Button
    lateinit var box86Btn: Button
    lateinit var box87Btn: Button
    lateinit var box88Btn: Button
    lateinit var box89Btn: Button
    lateinit var box90Btn: Button
    lateinit var box91Btn: Button
    lateinit var box92Btn: Button
    lateinit var box93Btn: Button
    lateinit var box94Btn: Button
    lateinit var box95Btn: Button
    lateinit var box96Btn: Button
    lateinit var box97Btn: Button
    lateinit var box98Btn: Button
    lateinit var box99Btn: Button
    lateinit var box100Btn: Button
    lateinit var texto: TextView
    lateinit var horizontal: RadioButton
    lateinit var vertical: RadioButton



    var porta = ArrayList<Int>()
    var buque = ArrayList<Int>()
    var submarino = ArrayList<Int>()
    var crucero = ArrayList<Int>()
    var lancha = ArrayList<Int>()
    var portab = true
    var buqueb = false
    var submarinob = false
    var crucerob = false
    var lanchab = false
    var orientacion = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colocar)

        box1Btn = findViewById(R.id.idBtnBox1)
        box2Btn = findViewById(R.id.idBtnBox2)
        box3Btn = findViewById(R.id.idBtnBox3)
        box4Btn = findViewById(R.id.idBtnBox4)
        box5Btn = findViewById(R.id.idBtnBox5)
        box6Btn = findViewById(R.id.idBtnBox6)
        box7Btn = findViewById(R.id.idBtnBox7)
        box8Btn = findViewById(R.id.idBtnBox8)
        box9Btn = findViewById(R.id.idBtnBox9)
        box10Btn = findViewById(R.id.idBtnBox10)
        box11Btn = findViewById(R.id.idBtnBox11)
        box12Btn = findViewById(R.id.idBtnBox12)
        box13Btn = findViewById(R.id.idBtnBox13)
        box14Btn = findViewById(R.id.idBtnBox14)
        box15Btn = findViewById(R.id.idBtnBox15)
        box16Btn = findViewById(R.id.idBtnBox16)
        box17Btn = findViewById(R.id.idBtnBox17)
        box18Btn = findViewById(R.id.idBtnBox18)
        box19Btn = findViewById(R.id.idBtnBox19)
        box20Btn = findViewById(R.id.idBtnBox20)
        box21Btn = findViewById(R.id.idBtnBox21)
        box22Btn = findViewById(R.id.idBtnBox22)
        box23Btn = findViewById(R.id.idBtnBox23)
        box24Btn = findViewById(R.id.idBtnBox24)
        box25Btn = findViewById(R.id.idBtnBox25)
        box26Btn = findViewById(R.id.idBtnBox26)
        box27Btn = findViewById(R.id.idBtnBox27)
        box28Btn = findViewById(R.id.idBtnBox28)
        box29Btn = findViewById(R.id.idBtnBox29)
        box30Btn = findViewById(R.id.idBtnBox30)
        box31Btn = findViewById(R.id.idBtnBox31)
        box32Btn = findViewById(R.id.idBtnBox32)
        box33Btn = findViewById(R.id.idBtnBox33)
        box34Btn = findViewById(R.id.idBtnBox34)
        box35Btn = findViewById(R.id.idBtnBox35)
        box36Btn = findViewById(R.id.idBtnBox36)
        box37Btn = findViewById(R.id.idBtnBox37)
        box38Btn = findViewById(R.id.idBtnBox38)
        box39Btn = findViewById(R.id.idBtnBox39)
        box40Btn = findViewById(R.id.idBtnBox40)
        box41Btn = findViewById(R.id.idBtnBox41)
        box42Btn = findViewById(R.id.idBtnBox42)
        box43Btn = findViewById(R.id.idBtnBox43)
        box44Btn = findViewById(R.id.idBtnBox44)
        box45Btn = findViewById(R.id.idBtnBox45)
        box46Btn = findViewById(R.id.idBtnBox46)
        box47Btn = findViewById(R.id.idBtnBox47)
        box48Btn = findViewById(R.id.idBtnBox48)
        box49Btn = findViewById(R.id.idBtnBox49)
        box50Btn = findViewById(R.id.idBtnBox50)
        box51Btn = findViewById(R.id.idBtnBox51)
        box52Btn = findViewById(R.id.idBtnBox52)
        box53Btn = findViewById(R.id.idBtnBox53)
        box54Btn = findViewById(R.id.idBtnBox54)
        box55Btn = findViewById(R.id.idBtnBox55)
        box56Btn = findViewById(R.id.idBtnBox56)
        box57Btn = findViewById(R.id.idBtnBox57)
        box58Btn = findViewById(R.id.idBtnBox58)
        box59Btn = findViewById(R.id.idBtnBox59)
        box60Btn = findViewById(R.id.idBtnBox60)
        box61Btn = findViewById(R.id.idBtnBox61)
        box62Btn = findViewById(R.id.idBtnBox62)
        box63Btn = findViewById(R.id.idBtnBox63)
        box64Btn = findViewById(R.id.idBtnBox64)
        box65Btn = findViewById(R.id.idBtnBox65)
        box66Btn = findViewById(R.id.idBtnBox66)
        box67Btn = findViewById(R.id.idBtnBox67)
        box68Btn = findViewById(R.id.idBtnBox68)
        box69Btn = findViewById(R.id.idBtnBox69)
        box70Btn = findViewById(R.id.idBtnBox70)
        box71Btn = findViewById(R.id.idBtnBox71)
        box72Btn = findViewById(R.id.idBtnBox72)
        box73Btn = findViewById(R.id.idBtnBox73)
        box74Btn = findViewById(R.id.idBtnBox74)
        box75Btn = findViewById(R.id.idBtnBox75)
        box76Btn = findViewById(R.id.idBtnBox76)
        box77Btn = findViewById(R.id.idBtnBox77)
        box78Btn = findViewById(R.id.idBtnBox78)
        box79Btn = findViewById(R.id.idBtnBox79)
        box80Btn = findViewById(R.id.idBtnBox80)
        box81Btn = findViewById(R.id.idBtnBox81)
        box82Btn = findViewById(R.id.idBtnBox82)
        box83Btn = findViewById(R.id.idBtnBox83)
        box84Btn = findViewById(R.id.idBtnBox84)
        box85Btn = findViewById(R.id.idBtnBox85)
        box86Btn = findViewById(R.id.idBtnBox86)
        box87Btn = findViewById(R.id.idBtnBox87)
        box88Btn = findViewById(R.id.idBtnBox88)
        box89Btn = findViewById(R.id.idBtnBox89)
        box90Btn = findViewById(R.id.idBtnBox90)
        box91Btn = findViewById(R.id.idBtnBox91)
        box92Btn = findViewById(R.id.idBtnBox92)
        box93Btn = findViewById(R.id.idBtnBox93)
        box94Btn = findViewById(R.id.idBtnBox94)
        box95Btn = findViewById(R.id.idBtnBox95)
        box96Btn = findViewById(R.id.idBtnBox96)
        box97Btn = findViewById(R.id.idBtnBox97)
        box98Btn = findViewById(R.id.idBtnBox98)
        box99Btn = findViewById(R.id.idBtnBox99)
        box100Btn = findViewById(R.id.idBtnBox100)
        texto = findViewById(R.id.idTVTurn)
        horizontal = findViewById(R.id.horizontal)
        vertical = findViewById(R.id.vertical)
        texto.text = "Porta Aviones(5)"
    }


    fun playNow(buttonSelected: Button, currCell: Int) {

        buttonSelected.setBackgroundColor(Color.parseColor("#7c7c7c"))
        buttonSelected.isEnabled = false
        Handler().postDelayed({}, 200)

    }


    fun buttonClick(view: View) {
        val but = view as Button
        var cellOnline = 0
        when (but.id) {
            R.id.idBtnBox1 -> cellOnline = 1
            R.id.idBtnBox2 -> cellOnline = 2
            R.id.idBtnBox3 -> cellOnline = 3
            R.id.idBtnBox4 -> cellOnline = 4
            R.id.idBtnBox5 -> cellOnline = 5
            R.id.idBtnBox6 -> cellOnline = 6
            R.id.idBtnBox7 -> cellOnline = 7
            R.id.idBtnBox8 -> cellOnline = 8
            R.id.idBtnBox9 -> cellOnline = 9
            R.id.idBtnBox10 -> cellOnline = 10
            R.id.idBtnBox11 -> cellOnline = 11
            R.id.idBtnBox12 -> cellOnline = 12
            R.id.idBtnBox13 -> cellOnline = 13
            R.id.idBtnBox14 -> cellOnline = 14
            R.id.idBtnBox15 -> cellOnline = 15
            R.id.idBtnBox16 -> cellOnline = 16
            R.id.idBtnBox17 -> cellOnline = 17
            R.id.idBtnBox18 -> cellOnline = 18
            R.id.idBtnBox19 -> cellOnline = 19
            R.id.idBtnBox20 -> cellOnline = 20
            R.id.idBtnBox21 -> cellOnline = 21
            R.id.idBtnBox22 -> cellOnline = 22
            R.id.idBtnBox23 -> cellOnline = 23
            R.id.idBtnBox24 -> cellOnline = 24
            R.id.idBtnBox25 -> cellOnline = 25
            R.id.idBtnBox26 -> cellOnline = 26
            R.id.idBtnBox27 -> cellOnline = 27
            R.id.idBtnBox28 -> cellOnline = 28
            R.id.idBtnBox29 -> cellOnline = 29
            R.id.idBtnBox30 -> cellOnline = 30
            R.id.idBtnBox31 -> cellOnline = 31
            R.id.idBtnBox32 -> cellOnline = 32
            R.id.idBtnBox33 -> cellOnline = 33
            R.id.idBtnBox34 -> cellOnline = 34
            R.id.idBtnBox35 -> cellOnline = 35
            R.id.idBtnBox36 -> cellOnline = 36
            R.id.idBtnBox37 -> cellOnline = 37
            R.id.idBtnBox38 -> cellOnline = 38
            R.id.idBtnBox39 -> cellOnline = 39
            R.id.idBtnBox40 -> cellOnline = 40
            R.id.idBtnBox41 -> cellOnline = 41
            R.id.idBtnBox42 -> cellOnline = 42
            R.id.idBtnBox43 -> cellOnline = 43
            R.id.idBtnBox44 -> cellOnline = 44
            R.id.idBtnBox45 -> cellOnline = 45
            R.id.idBtnBox46 -> cellOnline = 46
            R.id.idBtnBox47 -> cellOnline = 47
            R.id.idBtnBox48 -> cellOnline = 48
            R.id.idBtnBox49 -> cellOnline = 49
            R.id.idBtnBox50 -> cellOnline = 50
            R.id.idBtnBox51 -> cellOnline = 51
            R.id.idBtnBox52 -> cellOnline = 52
            R.id.idBtnBox53 -> cellOnline = 53
            R.id.idBtnBox54 -> cellOnline = 54
            R.id.idBtnBox55 -> cellOnline = 55
            R.id.idBtnBox56 -> cellOnline = 56
            R.id.idBtnBox57 -> cellOnline = 57
            R.id.idBtnBox58 -> cellOnline = 58
            R.id.idBtnBox59 -> cellOnline = 59
            R.id.idBtnBox60 -> cellOnline = 60
            R.id.idBtnBox61 -> cellOnline = 61
            R.id.idBtnBox62 -> cellOnline = 62
            R.id.idBtnBox63 -> cellOnline = 63
            R.id.idBtnBox64 -> cellOnline = 64
            R.id.idBtnBox65 -> cellOnline = 65
            R.id.idBtnBox66 -> cellOnline = 66
            R.id.idBtnBox67 -> cellOnline = 67
            R.id.idBtnBox68 -> cellOnline = 68
            R.id.idBtnBox69 -> cellOnline = 69
            R.id.idBtnBox70 -> cellOnline = 70
            R.id.idBtnBox71 -> cellOnline = 71
            R.id.idBtnBox72 -> cellOnline = 72
            R.id.idBtnBox73 -> cellOnline = 73
            R.id.idBtnBox74 -> cellOnline = 74
            R.id.idBtnBox75 -> cellOnline = 75
            R.id.idBtnBox76 -> cellOnline = 76
            R.id.idBtnBox77 -> cellOnline = 77
            R.id.idBtnBox78 -> cellOnline = 78
            R.id.idBtnBox79 -> cellOnline = 79
            R.id.idBtnBox80 -> cellOnline = 80
            R.id.idBtnBox81 -> cellOnline = 81
            R.id.idBtnBox82 -> cellOnline = 82
            R.id.idBtnBox83 -> cellOnline = 83
            R.id.idBtnBox84 -> cellOnline = 84
            R.id.idBtnBox85 -> cellOnline = 85
            R.id.idBtnBox86 -> cellOnline = 86
            R.id.idBtnBox87 -> cellOnline = 87
            R.id.idBtnBox88 -> cellOnline = 88
            R.id.idBtnBox89 -> cellOnline = 89
            R.id.idBtnBox90 -> cellOnline = 90
            R.id.idBtnBox91 -> cellOnline = 91
            R.id.idBtnBox92 -> cellOnline = 92
            R.id.idBtnBox93 -> cellOnline = 93
            R.id.idBtnBox94 -> cellOnline = 94
            R.id.idBtnBox95 -> cellOnline = 95
            R.id.idBtnBox96 -> cellOnline = 96
            R.id.idBtnBox97 -> cellOnline = 97
            R.id.idBtnBox98 -> cellOnline = 98
            R.id.idBtnBox99 -> cellOnline = 99
            R.id.idBtnBox100 -> cellOnline = 100
            else -> {
                cellOnline = 0
            }
        }

        if (portab) {
            texto.text = "Porta Aviones(5)"
            if (porta.isEmpty()) {
                if (horizontal.isChecked) {

                    playNow(but, cellOnline)
                    porta.add(cellOnline)
                    horizontal.isEnabled = false
                    vertical.isEnabled = false

                } else if (vertical.isChecked) {

                    playNow(but, cellOnline)
                    porta.add(cellOnline)
                    horizontal.isEnabled = false
                    vertical.isEnabled = false

                } else {
                    Toast.makeText(this, "Selecciona la horientacion", Toast.LENGTH_SHORT).show()
                }
            } else if (porta.size < 5) {
                if (horizontal.isChecked) {
                    if (cellOnline == Collections.max(porta) + 1 || cellOnline == Collections.min(
                            porta
                        ) - 1
                    ) {
                        playNow(but, cellOnline)
                        porta.add(cellOnline)
                    } else {
                        Toast.makeText(this, "No disponible", Toast.LENGTH_SHORT).show()
                    }
                } else if (vertical.isChecked) {
                    if (cellOnline == Collections.max(porta) + 10 || cellOnline == Collections.min(
                            porta
                        ) - 10
                    ) {
                        playNow(but, cellOnline)
                        porta.add(cellOnline)
                    } else {
                        Toast.makeText(this, "No disponible", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                horizontal.isEnabled = true
                vertical.isEnabled = true
                horizontal.isChecked = false
                vertical.isChecked = false
                portab = false
                buqueb = true


            }
        }

        if (buqueb) {
            texto.text = "Buque(4)"
            if (buque.isEmpty()) {
                if (horizontal.isChecked) {
                    playNow(but, cellOnline)
                    buque.add(cellOnline)
                    horizontal.isEnabled = false
                    vertical.isEnabled = false

                } else if (vertical.isChecked) {
                    playNow(but, cellOnline)
                    buque.add(cellOnline)
                    horizontal.isEnabled = false
                    vertical.isEnabled = false

                } else {
                    Toast.makeText(this, "Selecciona la horientacion", Toast.LENGTH_SHORT).show()
                }
            } else if (buque.size < 4) {
                if (horizontal.isChecked) {
                    if (cellOnline == Collections.max(buque) + 1 || cellOnline == Collections.min(
                            buque
                        ) - 1
                    ) {
                        playNow(but, cellOnline)
                        buque.add(cellOnline)
                    } else {
                        Toast.makeText(this, "No disponible", Toast.LENGTH_SHORT).show()
                    }
                } else if (vertical.isChecked) {
                    if (cellOnline == Collections.max(buque) + 10 || cellOnline == Collections.min(
                            buque
                        ) - 10
                    ) {
                        playNow(but, cellOnline)
                        buque.add(cellOnline)
                    } else {
                        Toast.makeText(this, "No disponible", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                horizontal.isEnabled = true
                vertical.isEnabled = true
                horizontal.isChecked = false
                vertical.isChecked = false
                buqueb = false
                submarinob = true


            }
        }

        if (submarinob) {
            texto.text = "Submarino(3)"
            if (submarino.isEmpty()) {
                if (horizontal.isChecked) {
                    playNow(but, cellOnline)
                    submarino.add(cellOnline)
                    horizontal.isEnabled = false
                    vertical.isEnabled = false

                } else if (vertical.isChecked) {
                    playNow(but, cellOnline)
                    submarino.add(cellOnline)
                    horizontal.isEnabled = false
                    vertical.isEnabled = false

                } else {
                    Toast.makeText(this, "Selecciona la horientacion", Toast.LENGTH_SHORT).show()
                }
            } else if (submarino.size < 3) {
                if (horizontal.isChecked) {
                    if (cellOnline == Collections.max(submarino) + 1 || cellOnline == Collections.min(
                            submarino
                        ) - 1
                    ) {
                        playNow(but, cellOnline)
                        submarino.add(cellOnline)
                    } else {
                        Toast.makeText(this, "No disponible", Toast.LENGTH_SHORT).show()
                    }
                } else if (vertical.isChecked) {
                    if (cellOnline == Collections.max(submarino) + 10 || cellOnline == Collections.min(
                            submarino
                        ) - 10
                    ) {
                        playNow(but, cellOnline)
                        submarino.add(cellOnline)
                    } else {
                        Toast.makeText(this, "No disponible", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                horizontal.isEnabled = true
                vertical.isEnabled = true
                horizontal.isChecked = false
                vertical.isChecked = false
                submarinob = false
                crucerob = true


            }
        }

        if (crucerob) {
            texto.text = "Crucero(2)"
            if (crucero.isEmpty()) {
                if (horizontal.isChecked) {
                    playNow(but, cellOnline)
                    crucero.add(cellOnline)
                    horizontal.isEnabled = false
                    vertical.isEnabled = false

                } else if (vertical.isChecked) {
                    playNow(but, cellOnline)
                    crucero.add(cellOnline)
                    horizontal.isEnabled = false
                    vertical.isEnabled = false

                } else {

                }
            } else if (crucero.size < 2) {
                if (horizontal.isChecked) {
                    if (cellOnline == Collections.max(crucero) + 1 || cellOnline == Collections.min(
                            crucero
                        ) - 1
                    ) {
                        playNow(but, cellOnline)
                        crucero.add(cellOnline)
                    } else {
                        Toast.makeText(this, "No disponible", Toast.LENGTH_SHORT).show()
                    }
                } else if (vertical.isChecked) {
                    if (cellOnline == Collections.max(crucero) + 10 || cellOnline == Collections.min(
                            crucero
                        ) - 10
                    ) {
                        playNow(but, cellOnline)
                        crucero.add(cellOnline)
                    } else {
                        Toast.makeText(this, "No disponible", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                horizontal.isChecked = false
                vertical.isChecked = false
                horizontal.isEnabled = true
                vertical.isEnabled = true
                crucerob = false
                lanchab = true
            }
        }

        if (lanchab) {
            texto.text = "Lancha(1)"
            if (horizontal.isChecked) {
                playNow(but, cellOnline)
                lancha.add(cellOnline)
                todo = (porta + buque + submarino + crucero + lancha) as ArrayList<Int>
                startActivity(Intent(this,OnlineMultiplayerActivity::class.java));
            } else if (vertical.isChecked) {
                playNow(but, cellOnline)
                lancha.add(cellOnline)
                todo = (porta + buque + submarino + crucero + lancha) as ArrayList<Int>
                startActivity(Intent(this,OnlineMultiplayerActivity::class.java));


            } else {
                Toast.makeText(this, "Selecciona la horientacion", Toast.LENGTH_SHORT).show()
            }

        }
    }

}