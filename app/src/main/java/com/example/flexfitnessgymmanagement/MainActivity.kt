package com.example.flexfitnessgymmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.flexfitnessgymmanagement.ui.home.HomeFragment
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val firebase : DatabaseReference = FirebaseDatabase.getInstance().getReference()


        val signupbuttonClick = findViewById<Button>(R.id.signUpbutton)
        signupbuttonClick.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
        val loginbuttonClick = findViewById<Button>(R.id.logInbutton)
        loginbuttonClick.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}