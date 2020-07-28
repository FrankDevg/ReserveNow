package com.projectmoviles.myapplication.User

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projectmoviles.myapplication.R
import com.projectmoviles.myapplication.user.UHistorialActivity
import kotlinx.android.synthetic.main.activity_u_historial_entre.*

class UHistorialEntreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_u_historial_entre)
        btn_back.setOnClickListener{
            var intent = Intent(this, UHistorialActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}