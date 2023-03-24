package com.example.proyecto


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class RegistroActivity : AppCompatActivity() {
    private lateinit var usrREt: EditText
    private lateinit var passREt: EditText
    private lateinit var passR2Et: EditText
    private lateinit var registrarBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        usrREt = findViewById(R.id.usrR)
        passREt = findViewById(R.id.passR)
        passR2Et = findViewById(R.id.passR2)
        registrarBtn = findViewById(R.id.RegistrarBtn)
        var sino = "No disponible"
        registrarBtn.setOnClickListener {

            FirebaseDatabase.getInstance().reference.child("usuarios").addValueEventListener(object :
                ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    val cuenta = Usuario(usrREt.text.toString(),passREt.text.toString(),0)
                    var data : Boolean = isValueAvaliable(snapshot, cuenta)

                        if(data==true){
                            Toast.makeText(this@RegistroActivity,"Usuario: ${sino}", Toast.LENGTH_SHORT).show()
                        }else{
                            if(passREt.text.toString() == passR2Et.text.toString() && usrREt.text.toString() != "" && !usrREt.text.isEmpty()&& !passR2Et.text.isEmpty()){
                                FirebaseDatabase.getInstance().reference.child("usuarios").push().setValue(cuenta)
                                sino= "Creado"
                                startActivity(Intent(this@RegistroActivity,MainActivity::class.java))
                            }else
                                Toast.makeText(this@RegistroActivity,"Datos erroneos", Toast.LENGTH_SHORT).show()
                        }

                }
                override fun onCancelled(error: DatabaseError) {
                    TODO("Not yet implemented")
                }
            })

        }
    }
    fun isValueAvaliable(snapshot: DataSnapshot, cuenta : Usuario): Boolean{
        var data = snapshot.children
        data.forEach{
            var usr : Usuario? = it.getValue(Usuario::class.java);
            if (usr?.nombre==cuenta.nombre ){
                return true
            }
        }
        return false
    }
}