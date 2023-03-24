package com.example.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {


    private lateinit var usrEt: EditText
    private lateinit var passEt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usrEt = findViewById(R.id.usr)
        passEt = findViewById(R.id.pass)
    }

    fun login(view: View){
        FirebaseDatabase.getInstance().reference.child("usuarios").addValueEventListener(object :
            ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val cuenta = Usuario(usrEt.text.toString(),passEt.text.toString(),0)
                var data : Boolean = isValueAvaliable(snapshot, cuenta)
                Handler().postDelayed({
                    if(data==true){
                        startActivity(Intent(this@MainActivity, MenuActivity::class.java))
                    }else{

                        Toast.makeText(this@MainActivity,"Datos erroneos", Toast.LENGTH_SHORT).show()

                    }
                },2000)
            }
            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
    }

    fun registro(view: View){
        val intent = Intent(this, RegistroActivity::class.java)
        startActivity(intent)
    }

    fun isValueAvaliable(snapshot: DataSnapshot, cuenta : Usuario): Boolean{
        var data = snapshot.children
        data.forEach{
            var usr : Usuario? = it.getValue(Usuario::class.java);
            if (usr?.nombre==cuenta.nombre && usr?.pass == cuenta.pass){
                return true
            }
        }
        return false
    }

}