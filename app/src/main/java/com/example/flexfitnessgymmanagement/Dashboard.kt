package com.example.flexfitnessgymmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val sessionsCardViewClick = findViewById<CardView>(R.id.sessionsCardView)
        sessionsCardViewClick.setOnClickListener {
            val intent = Intent(this, SessionsActivity::class.java)
            startActivity(intent)
        }

        val packagesCardViewClick = findViewById<CardView>(R.id.packagesCardView)
        packagesCardViewClick.setOnClickListener {
            val intent = Intent(this, PackagesActivity::class.java)
            startActivity(intent)
        }

        val clientsCardViewClick = findViewById<CardView>(R.id.clientsCardView)
        clientsCardViewClick.setOnClickListener {
            val intent = Intent(this, ReadClients::class.java)
            startActivity(intent)
        }

        val equipmentCardViewClick = findViewById<CardView>(R.id.equipmentCardView)
        equipmentCardViewClick.setOnClickListener {
            val intent = Intent(this, EquipmentActivity::class.java)
            startActivity(intent)
        }

        val instructorsCardViewClick = findViewById<CardView>(R.id.instructorsCardView)
        instructorsCardViewClick.setOnClickListener {
            val intent = Intent(this, EquipmentActivity::class.java)
            startActivity(intent)
        }




    }
}