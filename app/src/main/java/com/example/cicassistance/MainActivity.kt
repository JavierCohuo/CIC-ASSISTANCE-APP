package com.example.cicassistance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import java.security.Principal

class MainActivity : AppCompatActivity() {

    lateinit var dbHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbHelper = DatabaseHelper(this)

        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)


        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            val usuarioCorrecto = "EquipoCIC"
            val contraseñaCorrecta = "12345"

            if (username == usuarioCorrecto && password == contraseñaCorrecta) {
                Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
                // Aquí puedes iniciar la MainActivity
                val intent = Intent(this, pantalla_principal::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
            }
        }


    }
}