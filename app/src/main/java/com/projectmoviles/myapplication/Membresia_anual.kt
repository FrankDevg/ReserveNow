package com.projectmoviles.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_membresia_anual.*
import kotlinx.android.synthetic.main.activity_membresia_mensual.*

class Membresia_anual : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_membresia_anual)


        btnIzquierdaMensual.setOnClickListener {
            val intent = Intent(this, Membresia_semestral::class.java)
            startActivity(intent)
        }
        btnAnualRetornoHomeMembresia.setOnClickListener {
            val intent = Intent(this, Membresia::class.java)
            startActivity(intent)
        }
        btnComprarAnual.setOnClickListener {
            Toast.makeText(this, "Usted ha comprado un pase anual", Toast.LENGTH_SHORT).show()
        }
    }
}