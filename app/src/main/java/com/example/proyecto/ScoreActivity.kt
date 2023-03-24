package com.example.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_score.*
import kotlinx.android.synthetic.main.item_producto.*

class ScoreActivity : AppCompatActivity() {


    val hulk = Producto("Test",0.0,"",R.drawable.explosion)
    val iron = Producto("cesar",10.0,"",R.drawable.explosion)
    val spider = Producto("a",0.0,"",R.drawable.explosion)
    var nombre=""
    var a = listOf(hulk,iron,spider)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)


        FirebaseDatabase.getInstance().reference.child("usuarios").addValueEventListener(object :
            ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {

                var data = snapshot.children
                data.forEach{
                    var usr : Usuario? = it.getValue(Usuario::class.java);
                    Toast.makeText(this@ScoreActivity,usr?.nombre, Toast.LENGTH_LONG).show()
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        a=a+Producto(nombre,100.0,"",R.drawable.explosion)
        val adapter = ProductoAdapter(this,a)
        lista.adapter=adapter

    }

}