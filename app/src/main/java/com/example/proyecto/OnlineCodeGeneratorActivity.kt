package com.example.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

var isCodeMarker = true;
var code = "null"
var codeFound = false
var checkTemp = true
var keyValue : String = "null"

class OnlineCodeGeneratorActivity : AppCompatActivity() {
    lateinit var headTV : TextView
    lateinit var codeEdt : EditText
    lateinit var createCodeBtn : Button
    lateinit var joinCodeBtn : Button
    lateinit var loadingPB : ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_code_generator)
        headTV = findViewById(R.id.idTVHead)
        codeEdt = findViewById(R.id.idEdtCode)
        createCodeBtn = findViewById(R.id.idBtnCreate)
        joinCodeBtn = findViewById(R.id.idBtnJoin)
        loadingPB = findViewById(R.id.idPBLoading)

        createCodeBtn.setOnClickListener {
            code = "null"
            codeFound = false
            checkTemp = true
            keyValue = "null"
            code = codeEdt.text.toString()
            createCodeBtn.visibility = View.GONE
            joinCodeBtn.visibility = View.GONE
            codeEdt.visibility = View.GONE
            headTV.visibility = View.GONE
            loadingPB.visibility = View.VISIBLE
            if(code!="null" && code!=""){
                isCodeMarker = true
                FirebaseDatabase.getInstance().reference.child("codes").addValueEventListener(object : ValueEventListener{
                    override fun onDataChange(snapshot: DataSnapshot){
                        var check = isValueAvaliable(snapshot, code)
                        Handler().postDelayed({
                            if(check==true){
                                createCodeBtn.visibility = View.VISIBLE
                                joinCodeBtn.visibility = View.VISIBLE
                                codeEdt.visibility = View.VISIBLE
                                headTV.visibility = View.VISIBLE
                                loadingPB.visibility = View.GONE
                            }else{
                                FirebaseDatabase.getInstance().reference.child("codes").push().setValue(code)
                                isValueAvaliable(snapshot, code )
                                checkTemp = false
                                Handler().postDelayed({
                                    accepted()
                                    Toast.makeText(this@OnlineCodeGeneratorActivity,"Partida creada no volver atras",Toast.LENGTH_SHORT).show()
                                },300)
                            }
                        },2000)
                    }
                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
            }else{
                createCodeBtn.visibility = View.VISIBLE
                joinCodeBtn.visibility = View.VISIBLE
                codeEdt.visibility = View.VISIBLE
                headTV.visibility = View.VISIBLE
                loadingPB.visibility = View.GONE
                Toast.makeText(this,"Porfavor introduce un codigo valido",Toast.LENGTH_SHORT).show()
            }
        }
        joinCodeBtn.setOnClickListener {
            code = "null"
            codeFound = false
            checkTemp = true
            keyValue = "null"
            code = codeEdt.text.toString()
            if(code!="null" && code!=""){
                createCodeBtn.visibility = View.GONE
                joinCodeBtn.visibility = View.GONE
                codeEdt.visibility = View.GONE
                headTV.visibility = View.GONE
                loadingPB.visibility = View.VISIBLE
                isCodeMarker = false
                FirebaseDatabase.getInstance().reference.child("codes").addValueEventListener(object : ValueEventListener{
                    override fun onDataChange(snapshot: DataSnapshot) {
                        var data : Boolean = isValueAvaliable(snapshot, code)
                        Handler().postDelayed({
                            if(data==true){
                                codeFound = true
                                accepted()
                                createCodeBtn.visibility = View.VISIBLE
                                joinCodeBtn.visibility = View.VISIBLE
                                codeEdt.visibility = View.VISIBLE
                                headTV.visibility = View.VISIBLE
                                loadingPB.visibility = View.GONE
                            }else{
                                createCodeBtn.visibility = View.VISIBLE
                                joinCodeBtn.visibility = View.VISIBLE
                                codeEdt.visibility = View.VISIBLE
                                headTV.visibility = View.VISIBLE
                                loadingPB.visibility = View.GONE
                                Toast.makeText(this@OnlineCodeGeneratorActivity,"Codigo invalido",Toast.LENGTH_SHORT).show()

                            }
                        },2000)
                    }
                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }
                })
            }else{
                Toast.makeText(this,"Porfavor introduce un codigo valido",Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun accepted(){
        startActivity(Intent(this,Colocar::class.java));
        createCodeBtn.visibility = View.VISIBLE
        joinCodeBtn.visibility = View.VISIBLE
        codeEdt.visibility = View.VISIBLE
        headTV.visibility = View.VISIBLE
        loadingPB.visibility = View.GONE

    }
    fun isValueAvaliable(snapshot: DataSnapshot, code : String): Boolean{
        var data = snapshot.children
        data.forEach{
            var value = it.getValue().toString()
            if (value==code){
                keyValue = it.key.toString()
                return true
            }
        }
        return false
    }
}