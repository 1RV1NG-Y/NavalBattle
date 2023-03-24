package com.example.proyecto

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import kotlin.system.exitProcess

var isMyMove = isCodeMarker;
class OnlineMultiplayerActivity : AppCompatActivity() {

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
    lateinit var box1Btnv: Button
    lateinit var box2Btnv: Button
    lateinit var box3Btnv: Button
    lateinit var box4Btnv: Button
    lateinit var box5Btnv: Button
    lateinit var box6Btnv: Button
    lateinit var box7Btnv: Button
    lateinit var box8Btnv: Button
    lateinit var box9Btnv: Button
    lateinit var box10Btnv: Button
    lateinit var box11Btnv: Button
    lateinit var box12Btnv: Button
    lateinit var box13Btnv: Button
    lateinit var box14Btnv: Button
    lateinit var box15Btnv: Button
    lateinit var box16Btnv: Button
    lateinit var box17Btnv: Button
    lateinit var box18Btnv: Button
    lateinit var box19Btnv: Button
    lateinit var box20Btnv: Button
    lateinit var box21Btnv: Button
    lateinit var box22Btnv: Button
    lateinit var box23Btnv: Button
    lateinit var box24Btnv: Button
    lateinit var box25Btnv: Button
    lateinit var box26Btnv: Button
    lateinit var box27Btnv: Button
    lateinit var box28Btnv: Button
    lateinit var box29Btnv: Button
    lateinit var box30Btnv: Button
    lateinit var box31Btnv: Button
    lateinit var box32Btnv: Button
    lateinit var box33Btnv: Button
    lateinit var box34Btnv: Button
    lateinit var box35Btnv: Button
    lateinit var box36Btnv: Button
    lateinit var box37Btnv: Button
    lateinit var box38Btnv: Button
    lateinit var box39Btnv: Button
    lateinit var box40Btnv: Button
    lateinit var box41Btnv: Button
    lateinit var box42Btnv: Button
    lateinit var box43Btnv: Button
    lateinit var box44Btnv: Button
    lateinit var box45Btnv: Button
    lateinit var box46Btnv: Button
    lateinit var box47Btnv: Button
    lateinit var box48Btnv: Button
    lateinit var box49Btnv: Button
    lateinit var box50Btnv: Button
    lateinit var box51Btnv: Button
    lateinit var box52Btnv: Button
    lateinit var box53Btnv: Button
    lateinit var box54Btnv: Button
    lateinit var box55Btnv: Button
    lateinit var box56Btnv: Button
    lateinit var box57Btnv: Button
    lateinit var box58Btnv: Button
    lateinit var box59Btnv: Button
    lateinit var box60Btnv: Button
    lateinit var box61Btnv: Button
    lateinit var box62Btnv: Button
    lateinit var box63Btnv: Button
    lateinit var box64Btnv: Button
    lateinit var box65Btnv: Button
    lateinit var box66Btnv: Button
    lateinit var box67Btnv: Button
    lateinit var box68Btnv: Button
    lateinit var box69Btnv: Button
    lateinit var box70Btnv: Button
    lateinit var box71Btnv: Button
    lateinit var box72Btnv: Button
    lateinit var box73Btnv: Button
    lateinit var box74Btnv: Button
    lateinit var box75Btnv: Button
    lateinit var box76Btnv: Button
    lateinit var box77Btnv: Button
    lateinit var box78Btnv: Button
    lateinit var box79Btnv: Button
    lateinit var box80Btnv: Button
    lateinit var box81Btnv: Button
    lateinit var box82Btnv: Button
    lateinit var box83Btnv: Button
    lateinit var box84Btnv: Button
    lateinit var box85Btnv: Button
    lateinit var box86Btnv: Button
    lateinit var box87Btnv: Button
    lateinit var box88Btnv: Button
    lateinit var box89Btnv: Button
    lateinit var box90Btnv: Button
    lateinit var box91Btnv: Button
    lateinit var box92Btnv: Button
    lateinit var box93Btnv: Button
    lateinit var box94Btnv: Button
    lateinit var box95Btnv: Button
    lateinit var box96Btnv: Button
    lateinit var box97Btnv: Button
    lateinit var box98Btnv: Button
    lateinit var box99Btnv: Button
    lateinit var box100Btnv: Button

    lateinit var turnTV: TextView

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var emptyCells = ArrayList<Int>()
    var activeUser = 1
    var winner = false
    var hits = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_multiplayer)

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

        box1Btnv = findViewById(R.id.idBtnBox1v)
        box2Btnv = findViewById(R.id.idBtnBox2v)
        box3Btnv = findViewById(R.id.idBtnBox3v)
        box4Btnv = findViewById(R.id.idBtnBox4v)
        box5Btnv = findViewById(R.id.idBtnBox5v)
        box6Btnv = findViewById(R.id.idBtnBox6v)
        box7Btnv = findViewById(R.id.idBtnBox7v)
        box8Btnv = findViewById(R.id.idBtnBox8v)
        box9Btnv = findViewById(R.id.idBtnBox9v)
        box10Btnv = findViewById(R.id.idBtnBox10v)
        box11Btnv = findViewById(R.id.idBtnBox11v)
        box12Btnv = findViewById(R.id.idBtnBox12v)
        box13Btnv = findViewById(R.id.idBtnBox13v)
        box14Btnv = findViewById(R.id.idBtnBox14v)
        box15Btnv = findViewById(R.id.idBtnBox15v)
        box16Btnv = findViewById(R.id.idBtnBox16v)
        box17Btnv = findViewById(R.id.idBtnBox17v)
        box18Btnv = findViewById(R.id.idBtnBox18v)
        box19Btnv = findViewById(R.id.idBtnBox19v)
        box20Btnv = findViewById(R.id.idBtnBox20v)
        box21Btnv = findViewById(R.id.idBtnBox21v)
        box22Btnv = findViewById(R.id.idBtnBox22v)
        box23Btnv = findViewById(R.id.idBtnBox23v)
        box24Btnv = findViewById(R.id.idBtnBox24v)
        box25Btnv = findViewById(R.id.idBtnBox25v)
        box26Btnv = findViewById(R.id.idBtnBox26v)
        box27Btnv = findViewById(R.id.idBtnBox27v)
        box28Btnv = findViewById(R.id.idBtnBox28v)
        box29Btnv = findViewById(R.id.idBtnBox29v)
        box30Btnv = findViewById(R.id.idBtnBox30v)
        box31Btnv = findViewById(R.id.idBtnBox31v)
        box32Btnv = findViewById(R.id.idBtnBox32v)
        box33Btnv = findViewById(R.id.idBtnBox33v)
        box34Btnv = findViewById(R.id.idBtnBox34v)
        box35Btnv = findViewById(R.id.idBtnBox35v)
        box36Btnv = findViewById(R.id.idBtnBox36v)
        box37Btnv = findViewById(R.id.idBtnBox37v)
        box38Btnv = findViewById(R.id.idBtnBox38v)
        box39Btnv = findViewById(R.id.idBtnBox39v)
        box40Btnv = findViewById(R.id.idBtnBox40v)
        box41Btnv = findViewById(R.id.idBtnBox41v)
        box42Btnv = findViewById(R.id.idBtnBox42v)
        box43Btnv = findViewById(R.id.idBtnBox43v)
        box44Btnv = findViewById(R.id.idBtnBox44v)
        box45Btnv = findViewById(R.id.idBtnBox45v)
        box46Btnv = findViewById(R.id.idBtnBox46v)
        box47Btnv = findViewById(R.id.idBtnBox47v)
        box48Btnv = findViewById(R.id.idBtnBox48v)
        box49Btnv = findViewById(R.id.idBtnBox49v)
        box50Btnv = findViewById(R.id.idBtnBox50v)
        box51Btnv = findViewById(R.id.idBtnBox51v)
        box52Btnv = findViewById(R.id.idBtnBox52v)
        box53Btnv = findViewById(R.id.idBtnBox53v)
        box54Btnv = findViewById(R.id.idBtnBox54v)
        box55Btnv = findViewById(R.id.idBtnBox55v)
        box56Btnv = findViewById(R.id.idBtnBox56v)
        box57Btnv = findViewById(R.id.idBtnBox57v)
        box58Btnv = findViewById(R.id.idBtnBox58v)
        box59Btnv = findViewById(R.id.idBtnBox59v)
        box60Btnv = findViewById(R.id.idBtnBox60v)
        box61Btnv = findViewById(R.id.idBtnBox61v)
        box62Btnv = findViewById(R.id.idBtnBox62v)
        box63Btnv = findViewById(R.id.idBtnBox63v)
        box64Btnv = findViewById(R.id.idBtnBox64v)
        box65Btnv = findViewById(R.id.idBtnBox65v)
        box66Btnv = findViewById(R.id.idBtnBox66v)
        box67Btnv = findViewById(R.id.idBtnBox67v)
        box68Btnv = findViewById(R.id.idBtnBox68v)
        box69Btnv = findViewById(R.id.idBtnBox69v)
        box70Btnv = findViewById(R.id.idBtnBox70v)
        box71Btnv = findViewById(R.id.idBtnBox71v)
        box72Btnv = findViewById(R.id.idBtnBox72v)
        box73Btnv = findViewById(R.id.idBtnBox73v)
        box74Btnv = findViewById(R.id.idBtnBox74v)
        box75Btnv = findViewById(R.id.idBtnBox75v)
        box76Btnv = findViewById(R.id.idBtnBox76v)
        box77Btnv = findViewById(R.id.idBtnBox77v)
        box78Btnv = findViewById(R.id.idBtnBox78v)
        box79Btnv = findViewById(R.id.idBtnBox79v)
        box80Btnv = findViewById(R.id.idBtnBox80v)
        box81Btnv = findViewById(R.id.idBtnBox81v)
        box82Btnv = findViewById(R.id.idBtnBox82v)
        box83Btnv = findViewById(R.id.idBtnBox83v)
        box84Btnv = findViewById(R.id.idBtnBox84v)
        box85Btnv = findViewById(R.id.idBtnBox85v)
        box86Btnv = findViewById(R.id.idBtnBox86v)
        box87Btnv = findViewById(R.id.idBtnBox87v)
        box88Btnv = findViewById(R.id.idBtnBox88v)
        box89Btnv = findViewById(R.id.idBtnBox89v)
        box90Btnv = findViewById(R.id.idBtnBox90v)
        box91Btnv = findViewById(R.id.idBtnBox91v)
        box92Btnv = findViewById(R.id.idBtnBox92v)
        box93Btnv = findViewById(R.id.idBtnBox93v)
        box94Btnv = findViewById(R.id.idBtnBox94v)
        box95Btnv = findViewById(R.id.idBtnBox95v)
        box96Btnv = findViewById(R.id.idBtnBox96v)
        box97Btnv = findViewById(R.id.idBtnBox97v)
        box98Btnv = findViewById(R.id.idBtnBox98v)
        box99Btnv = findViewById(R.id.idBtnBox99v)
        box100Btnv = findViewById(R.id.idBtnBox100v)

        box1Btnv.isEnabled = false
        box2Btnv.isEnabled = false
        box3Btnv.isEnabled = false
        box4Btnv.isEnabled = false
        box5Btnv.isEnabled = false
        box6Btnv.isEnabled = false
        box7Btnv.isEnabled = false
        box8Btnv.isEnabled = false
        box9Btnv.isEnabled = false
        box10Btnv.isEnabled = false
        box11Btnv.isEnabled = false
        box12Btnv.isEnabled = false
        box13Btnv.isEnabled = false
        box14Btnv.isEnabled = false
        box15Btnv.isEnabled = false
        box16Btnv.isEnabled = false
        box17Btnv.isEnabled = false
        box18Btnv.isEnabled = false
        box19Btnv.isEnabled = false
        box20Btnv.isEnabled = false
        box21Btnv.isEnabled = false
        box22Btnv.isEnabled = false
        box23Btnv.isEnabled = false
        box24Btnv.isEnabled = false
        box25Btnv.isEnabled = false
        box26Btnv.isEnabled = false
        box27Btnv.isEnabled = false
        box28Btnv.isEnabled = false
        box29Btnv.isEnabled = false
        box30Btnv.isEnabled = false
        box31Btnv.isEnabled = false
        box32Btnv.isEnabled = false
        box33Btnv.isEnabled = false
        box34Btnv.isEnabled = false
        box35Btnv.isEnabled = false
        box36Btnv.isEnabled = false
        box37Btnv.isEnabled = false
        box38Btnv.isEnabled = false
        box39Btnv.isEnabled = false
        box40Btnv.isEnabled = false
        box41Btnv.isEnabled = false
        box42Btnv.isEnabled = false
        box43Btnv.isEnabled = false
        box44Btnv.isEnabled = false
        box45Btnv.isEnabled = false
        box46Btnv.isEnabled = false
        box47Btnv.isEnabled = false
        box48Btnv.isEnabled = false
        box49Btnv.isEnabled = false
        box50Btnv.isEnabled = false
        box51Btnv.isEnabled = false
        box52Btnv.isEnabled = false
        box53Btnv.isEnabled = false
        box54Btnv.isEnabled = false
        box55Btnv.isEnabled = false
        box56Btnv.isEnabled = false
        box57Btnv.isEnabled = false
        box58Btnv.isEnabled = false
        box59Btnv.isEnabled = false
        box60Btnv.isEnabled = false
        box61Btnv.isEnabled = false
        box62Btnv.isEnabled = false
        box63Btnv.isEnabled = false
        box64Btnv.isEnabled = false
        box65Btnv.isEnabled = false
        box66Btnv.isEnabled = false
        box67Btnv.isEnabled = false
        box68Btnv.isEnabled = false
        box69Btnv.isEnabled = false
        box70Btnv.isEnabled = false
        box71Btnv.isEnabled = false
        box72Btnv.isEnabled = false
        box73Btnv.isEnabled = false
        box74Btnv.isEnabled = false
        box75Btnv.isEnabled = false
        box76Btnv.isEnabled = false
        box77Btnv.isEnabled = false
        box78Btnv.isEnabled = false
        box79Btnv.isEnabled = false
        box80Btnv.isEnabled = false
        box81Btnv.isEnabled = false
        box82Btnv.isEnabled = false
        box83Btnv.isEnabled = false
        box84Btnv.isEnabled = false
        box85Btnv.isEnabled = false
        box86Btnv.isEnabled = false
        box87Btnv.isEnabled = false
        box88Btnv.isEnabled = false
        box89Btnv.isEnabled = false
        box90Btnv.isEnabled = false
        box91Btnv.isEnabled = false
        box92Btnv.isEnabled = false
        box93Btnv.isEnabled = false
        box94Btnv.isEnabled = false
        box95Btnv.isEnabled = false
        box96Btnv.isEnabled = false
        box97Btnv.isEnabled = false
        box98Btnv.isEnabled = false
        box99Btnv.isEnabled = false
        box100Btnv.isEnabled = false

        turnTV = findViewById(R.id.idTVTurn)
        if (isMyMove == true) {
            turnTV.text = "Tu turno - Hits recibidos ${hits}"
        } else
            turnTV.text = "Esperando al oponente"
        FirebaseDatabase.getInstance().reference.child("data").child(code)
            .addChildEventListener(object : ChildEventListener {
                override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
                    var data = snapshot.value
                    if (isMyMove == true) {
                        isMyMove = false
                        moveOnline(data.toString(), isMyMove)
                    } else {
                        isMyMove = true
                        moveOnline(data.toString(), isMyMove)
                    }
                }

                override fun onChildChanged(snapshot: DataSnapshot, previousChildName: String?) {
                    TODO("Not yet implemented")
                }

                override fun onChildRemoved(snapshot: DataSnapshot) {
                    reset()
                    Toast.makeText(this@OnlineMultiplayerActivity, "Reiniciado", Toast.LENGTH_SHORT)
                        .show()
                }

                override fun onChildMoved(snapshot: DataSnapshot, previousChildName: String?) {
                    TODO("Not yet implemented")
                }

                override fun onCancelled(error: DatabaseError) {
                    TODO("Not yet implemented")
                }

            })
        for(i in todo){
            var buttonSelected: Button?
            buttonSelected = when (i) {
                1 -> box1Btnv
                2 -> box2Btnv
                3 -> box3Btnv
                4 -> box4Btnv
                5 -> box5Btnv
                6 -> box6Btnv
                7 -> box7Btnv
                8 -> box8Btnv
                9 -> box9Btnv
                10 -> box10Btnv
                11 -> box11Btnv
                12 -> box12Btnv
                13 -> box13Btnv
                14 -> box14Btnv
                15 -> box15Btnv
                16 -> box16Btnv
                17 -> box17Btnv
                18 -> box18Btnv
                19 -> box19Btnv
                20 -> box20Btnv
                21 -> box21Btnv
                22 -> box22Btnv
                23 -> box23Btnv
                24 -> box24Btnv
                25 -> box25Btnv
                26 -> box26Btnv
                27 -> box27Btnv
                28 -> box28Btnv
                29 -> box29Btnv
                30 -> box30Btnv
                31 -> box31Btnv
                32 -> box32Btnv
                33 -> box33Btnv
                34 -> box34Btnv
                35 -> box35Btnv
                36 -> box36Btnv
                37 -> box37Btnv
                38 -> box38Btnv
                39 -> box39Btnv
                40 -> box40Btnv
                41 -> box41Btnv
                42 -> box42Btnv
                43 -> box43Btnv
                44 -> box44Btnv
                45 -> box45Btnv
                46 -> box46Btnv
                47 -> box47Btnv
                48 -> box48Btnv
                49 -> box49Btnv
                50 -> box50Btnv
                51 -> box51Btnv
                52 -> box52Btnv
                53 -> box53Btnv
                54 -> box54Btnv
                55 -> box55Btnv
                56 -> box56Btnv
                57 -> box57Btnv
                58 -> box58Btnv
                59 -> box59Btnv
                60 -> box60Btnv
                61 -> box61Btnv
                62 -> box62Btnv
                63 -> box63Btnv
                64 -> box64Btnv
                65 -> box65Btnv
                66 -> box66Btnv
                67 -> box67Btnv
                68 -> box68Btnv
                69 -> box69Btnv
                70 -> box70Btnv
                71 -> box71Btnv
                72 -> box72Btnv
                73 -> box73Btnv
                74 -> box74Btnv
                75 -> box75Btnv
                76 -> box76Btnv
                77 -> box77Btnv
                78 -> box78Btnv
                79 -> box79Btnv
                80 -> box80Btnv
                81 -> box81Btnv
                82 -> box82Btnv
                83 -> box83Btnv
                84 -> box84Btnv
                85 -> box85Btnv
                86 -> box86Btnv
                87 -> box87Btnv
                88 -> box88Btnv
                89 -> box89Btnv
                90 -> box90Btnv
                91 -> box91Btnv
                92 -> box92Btnv
                93 -> box93Btnv
                94 -> box94Btnv
                95 -> box95Btnv
                96 -> box96Btnv
                97 -> box97Btnv
                98 -> box98Btnv
                99 -> box99Btnv
                100 -> box100Btnv
                else -> {
                    box1Btnv
                }
            }
            buttonSelected.setBackgroundColor(Color.parseColor("#7c7c7c"))

        }
    }

    fun moveOnline(data: String, move: Boolean) {

        if (move) {
            var buttonSelected: Button?
            buttonSelected = when (data.toInt()) {
                1 -> box1Btn
                2 -> box2Btn
                3 -> box3Btn
                4 -> box4Btn
                5 -> box5Btn
                6 -> box6Btn
                7 -> box7Btn
                8 -> box8Btn
                9 -> box9Btn
                10 -> box10Btn
                11 -> box11Btn
                12 -> box12Btn
                13 -> box13Btn
                14 -> box14Btn
                15 -> box15Btn
                16 -> box16Btn
                17 -> box17Btn
                18 -> box18Btn
                19 -> box19Btn
                20 -> box20Btn
                21 -> box21Btn
                22 -> box22Btn
                23 -> box23Btn
                24 -> box24Btn
                25 -> box25Btn
                26 -> box26Btn
                27 -> box27Btn
                28 -> box28Btn
                29 -> box29Btn
                30 -> box30Btn
                31 -> box31Btn
                32 -> box32Btn
                33 -> box33Btn
                34 -> box34Btn
                35 -> box35Btn
                36 -> box36Btn
                37 -> box37Btn
                38 -> box38Btn
                39 -> box39Btn
                40 -> box40Btn
                41 -> box41Btn
                42 -> box42Btn
                43 -> box43Btn
                44 -> box44Btn
                45 -> box45Btn
                46 -> box46Btn
                47 -> box47Btn
                48 -> box48Btn
                49 -> box49Btn
                50 -> box50Btn
                51 -> box51Btn
                52 -> box52Btn
                53 -> box53Btn
                54 -> box54Btn
                55 -> box55Btn
                56 -> box56Btn
                57 -> box57Btn
                58 -> box58Btn
                59 -> box59Btn
                60 -> box60Btn
                61 -> box61Btn
                62 -> box62Btn
                63 -> box63Btn
                64 -> box64Btn
                65 -> box65Btn
                66 -> box66Btn
                67 -> box67Btn
                68 -> box68Btn
                69 -> box69Btn
                70 -> box70Btn
                71 -> box71Btn
                72 -> box72Btn
                73 -> box73Btn
                74 -> box74Btn
                75 -> box75Btn
                76 -> box76Btn
                77 -> box77Btn
                78 -> box78Btn
                79 -> box79Btn
                80 -> box80Btn
                81 -> box81Btn
                82 -> box82Btn
                83 -> box83Btn
                84 -> box84Btn
                85 -> box85Btn
                86 -> box86Btn
                87 -> box87Btn
                88 -> box88Btn
                89 -> box89Btn
                90 -> box90Btn
                91 -> box91Btn
                92 -> box92Btn
                93 -> box93Btn
                94 -> box94Btn
                95 -> box95Btn
                96 -> box96Btn
                97 -> box97Btn
                98 -> box98Btn
                99 -> box99Btn
                100 -> box100Btn
                else -> {
                    box1Btn
                }
            }
            var buttonSelected2: Button?
            buttonSelected2 = when (data.toInt()) {
                1 -> box1Btnv
                2 -> box2Btnv
                3 -> box3Btnv
                4 -> box4Btnv
                5 -> box5Btnv
                6 -> box6Btnv
                7 -> box7Btnv
                8 -> box8Btnv
                9 -> box9Btnv
                10 -> box10Btnv
                11 -> box11Btnv
                12 -> box12Btnv
                13 -> box13Btnv
                14 -> box14Btnv
                15 -> box15Btnv
                16 -> box16Btnv
                17 -> box17Btnv
                18 -> box18Btnv
                19 -> box19Btnv
                20 -> box20Btnv
                21 -> box21Btnv
                22 -> box22Btnv
                23 -> box23Btnv
                24 -> box24Btnv
                25 -> box25Btnv
                26 -> box26Btnv
                27 -> box27Btnv
                28 -> box28Btnv
                29 -> box29Btnv
                30 -> box30Btnv
                31 -> box31Btnv
                32 -> box32Btnv
                33 -> box33Btnv
                34 -> box34Btnv
                35 -> box35Btnv
                36 -> box36Btnv
                37 -> box37Btnv
                38 -> box38Btnv
                39 -> box39Btnv
                40 -> box40Btnv
                41 -> box41Btnv
                42 -> box42Btnv
                43 -> box43Btnv
                44 -> box44Btnv
                45 -> box45Btnv
                46 -> box46Btnv
                47 -> box47Btnv
                48 -> box48Btnv
                49 -> box49Btnv
                50 -> box50Btnv
                51 -> box51Btnv
                52 -> box52Btnv
                53 -> box53Btnv
                54 -> box54Btnv
                55 -> box55Btnv
                56 -> box56Btnv
                57 -> box57Btnv
                58 -> box58Btnv
                59 -> box59Btnv
                60 -> box60Btnv
                61 -> box61Btnv
                62 -> box62Btnv
                63 -> box63Btnv
                64 -> box64Btnv
                65 -> box65Btnv
                66 -> box66Btnv
                67 -> box67Btnv
                68 -> box68Btnv
                69 -> box69Btnv
                70 -> box70Btnv
                71 -> box71Btnv
                72 -> box72Btnv
                73 -> box73Btnv
                74 -> box74Btnv
                75 -> box75Btnv
                76 -> box76Btnv
                77 -> box77Btnv
                78 -> box78Btnv
                79 -> box79Btnv
                80 -> box80Btnv
                81 -> box81Btnv
                82 -> box82Btnv
                83 -> box83Btnv
                84 -> box84Btnv
                85 -> box85Btnv
                86 -> box86Btnv
                87 -> box87Btnv
                88 -> box88Btnv
                89 -> box89Btnv
                90 -> box90Btnv
                91 -> box91Btnv
                92 -> box92Btnv
                93 -> box93Btnv
                94 -> box94Btnv
                95 -> box95Btnv
                96 -> box96Btnv
                97 -> box97Btnv
                98 -> box98Btnv
                99 -> box99Btnv
                100 -> box100Btnv
                else -> {
                    box1Btnv
                }
            }
            if (isMyMove == false) {
                buttonSelected.isEnabled = false
            }

            if (isMyMove == true) {
                buttonSelected2.setBackgroundColor(Color.parseColor("#EC0C0C"))
                if(todo.contains(data.toInt())){
                    hits++
                }
            }
            turnTV.text = "Tu turno - Hits recibidos ${hits}"
            player2.add(data.toInt())
            emptyCells.add(data.toInt())
            Handler().postDelayed({}, 200)
            checkWinner()
        }
    }

    private fun checkWinner() : Int {
        if(hits == 15){
            Handler().postDelayed({},4000)
            val build = AlertDialog.Builder(this)
            build.setTitle("Game Over")
            build.setMessage("Perdiste ")
            build.setPositiveButton("Ok"){ dialog, which ->
                removeCode()
                exitProcess(1)
            }
            Handler().postDelayed({build.show()},2000)
            return 1
        }
        return 0
    }


    fun playNow(buttonSelected: Button, currCell: Int) {

        emptyCells.remove(currCell)
        turnTV.text = "Esperando al oponente"

        buttonSelected.setBackgroundColor(Color.parseColor("#EC0C0C"))
        player1.add(currCell)
        emptyCells.add(currCell)
        buttonSelected.isEnabled = false
        Handler().postDelayed({}, 200)
        checkWinner()
    }

    fun reset() {
        player1.clear()
        player2.clear()
        emptyCells.clear()
        activeUser = 1
        for (i in 1..9) {
            var buttonSelected: Button?
            buttonSelected = when (i) {
                1 -> box1Btn
                2 -> box2Btn
                3 -> box3Btn
                4 -> box4Btn
                5 -> box5Btn
                6 -> box6Btn
                7 -> box7Btn
                8 -> box8Btn
                9 -> box9Btn
                10 -> box10Btn
                11 -> box11Btn
                12 -> box12Btn
                13 -> box13Btn
                14 -> box14Btn
                15 -> box15Btn
                16 -> box16Btn
                17 -> box17Btn
                18 -> box18Btn
                19 -> box19Btn
                20 -> box20Btn
                21 -> box21Btn
                22 -> box22Btn
                23 -> box23Btn
                24 -> box24Btn
                25 -> box25Btn
                26 -> box26Btn
                27 -> box27Btn
                28 -> box28Btn
                29 -> box29Btn
                30 -> box30Btn
                31 -> box31Btn
                32 -> box32Btn
                33 -> box33Btn
                34 -> box34Btn
                35 -> box35Btn
                36 -> box36Btn
                37 -> box37Btn
                38 -> box38Btn
                39 -> box39Btn
                40 -> box40Btn
                41 -> box41Btn
                42 -> box42Btn
                43 -> box43Btn
                44 -> box44Btn
                45 -> box45Btn
                46 -> box46Btn
                47 -> box47Btn
                48 -> box48Btn
                49 -> box49Btn
                50 -> box50Btn
                51 -> box51Btn
                52 -> box52Btn
                53 -> box53Btn
                54 -> box54Btn
                55 -> box55Btn
                56 -> box56Btn
                57 -> box57Btn
                58 -> box58Btn
                59 -> box59Btn
                60 -> box60Btn
                61 -> box61Btn
                62 -> box62Btn
                63 -> box63Btn
                64 -> box64Btn
                65 -> box65Btn
                66 -> box66Btn
                67 -> box67Btn
                68 -> box68Btn
                69 -> box69Btn
                70 -> box70Btn
                71 -> box71Btn
                72 -> box72Btn
                73 -> box73Btn
                74 -> box74Btn
                75 -> box75Btn
                76 -> box76Btn
                77 -> box77Btn
                78 -> box78Btn
                79 -> box79Btn
                80 -> box80Btn
                81 -> box81Btn
                82 -> box82Btn
                83 -> box83Btn
                84 -> box84Btn
                85 -> box85Btn
                86 -> box86Btn
                87 -> box87Btn
                88 -> box88Btn
                89 -> box89Btn
                90 -> box90Btn
                91 -> box91Btn
                92 -> box92Btn
                93 -> box93Btn
                94 -> box94Btn
                95 -> box95Btn
                96 -> box96Btn
                97 -> box97Btn
                98 -> box98Btn
                99 -> box99Btn
                100 -> box100Btn
                else -> {
                    box1Btn
                }
            }
            buttonSelected.isEnabled = true
            buttonSelected.text = ""
            isMyMove = isCodeMarker
            if (isCodeMarker) {
                FirebaseDatabase.getInstance().reference.child("data").child(code).removeValue()
            }
        }
        for (i in 1..9) {
            var buttonSelected: Button?
            buttonSelected = when (i) {
                1 -> box1Btnv
                2 -> box2Btnv
                3 -> box3Btnv
                4 -> box4Btnv
                5 -> box5Btnv
                6 -> box6Btnv
                7 -> box7Btnv
                8 -> box8Btnv
                9 -> box9Btnv
                10 -> box10Btnv
                11 -> box11Btnv
                12 -> box12Btnv
                13 -> box13Btnv
                14 -> box14Btnv
                15 -> box15Btnv
                16 -> box16Btnv
                17 -> box17Btnv
                18 -> box18Btnv
                19 -> box19Btnv
                20 -> box20Btnv
                21 -> box21Btnv
                22 -> box22Btnv
                23 -> box23Btnv
                24 -> box24Btnv
                25 -> box25Btnv
                26 -> box26Btnv
                27 -> box27Btnv
                28 -> box28Btnv
                29 -> box29Btnv
                30 -> box30Btnv
                31 -> box31Btnv
                32 -> box32Btnv
                33 -> box33Btnv
                34 -> box34Btnv
                35 -> box35Btnv
                36 -> box36Btnv
                37 -> box37Btnv
                38 -> box38Btnv
                39 -> box39Btnv
                40 -> box40Btnv
                41 -> box41Btnv
                42 -> box42Btnv
                43 -> box43Btnv
                44 -> box44Btnv
                45 -> box45Btnv
                46 -> box46Btnv
                47 -> box47Btnv
                48 -> box48Btnv
                49 -> box49Btnv
                50 -> box50Btnv
                51 -> box51Btnv
                52 -> box52Btnv
                53 -> box53Btnv
                54 -> box54Btnv
                55 -> box55Btnv
                56 -> box56Btnv
                57 -> box57Btnv
                58 -> box58Btnv
                59 -> box59Btnv
                60 -> box60Btnv
                61 -> box61Btnv
                62 -> box62Btnv
                63 -> box63Btnv
                64 -> box64Btnv
                65 -> box65Btnv
                66 -> box66Btnv
                67 -> box67Btnv
                68 -> box68Btnv
                69 -> box69Btnv
                70 -> box70Btnv
                71 -> box71Btnv
                72 -> box72Btnv
                73 -> box73Btnv
                74 -> box74Btnv
                75 -> box75Btnv
                76 -> box76Btnv
                77 -> box77Btnv
                78 -> box78Btnv
                79 -> box79Btnv
                80 -> box80Btnv
                81 -> box81Btnv
                82 -> box82Btnv
                83 -> box83Btnv
                84 -> box84Btnv
                85 -> box85Btnv
                86 -> box86Btnv
                87 -> box87Btnv
                88 -> box88Btnv
                89 -> box89Btnv
                90 -> box90Btnv
                91 -> box91Btnv
                92 -> box92Btnv
                93 -> box93Btnv
                94 -> box94Btnv
                95 -> box95Btnv
                96 -> box96Btnv
                97 -> box97Btnv
                98 -> box98Btnv
                99 -> box99Btnv
                100 -> box100Btnv
                else -> {
                    box1Btnv
                }
            }
            buttonSelected.isEnabled = false
            buttonSelected.text = ""
        }
    }

    fun removeCode() {
        if (isCodeMarker) {
            FirebaseDatabase.getInstance().reference.child("codes").child(keyValue).removeValue()
        }
    }

    override fun onBackPressed() {
        removeCode()
        if (isCodeMarker) {
            FirebaseDatabase.getInstance().reference.child("data").child(code).removeValue()
        }
        exitProcess(0)
    }

    fun updateDatabase(cellId: Int) {
        FirebaseDatabase.getInstance().reference.child("data").child(code).push().setValue(cellId)
    }

    fun buttonClick(view: View) {
        if (isMyMove) {
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
            playerTurn = false
            Handler().postDelayed({ playerTurn = true }, 600)
            playNow(but, cellOnline)
            updateDatabase(cellOnline)
        }
    }
}