package com.example.cicassistance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pantalla_principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)

        findViewById<Button>(R.id.buttonlogout).setOnClickListener {
            logout()
        }

        val gosolicitar_servicio_tecnico = findViewById<Button>(R.id.button)
        gosolicitar_servicio_tecnico.setOnClickListener {
            goToSolicitarServicio()
        }

        val goStatus_de_la_solicitud = findViewById<Button>(R.id.button3)
        goStatus_de_la_solicitud.setOnClickListener {
            goToStatusDeLaSolicitud()
        }
/*
        val goVales = findViewById<Button>(R.id.button5)
        goVales.setOnClickListener {
            goToVales()
        }

 */
    }

    private fun goToSolicitarServicio() {
        val intent = Intent(this, solicitar_servicio_tecnico::class.java)
        startActivity(intent)
    }

    private fun goToStatusDeLaSolicitud() {
        val intent = Intent(this, status_de_la_solicitud::class.java)
        startActivity(intent)
    }
/*
    private fun goToVales() {
        val intent = Intent(this, vales::class.java)
        startActivity(intent)
    }
*/
    private fun logout() {

        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()

    }
}
