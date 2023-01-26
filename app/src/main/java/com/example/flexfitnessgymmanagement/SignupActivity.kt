package com.example.flexfitnessgymmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.flexfitnessgymmanagement.ui.home.HomeFragment
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignupActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var genderEditText: EditText
    private lateinit var mobileEditText: EditText
    private lateinit var setpwdEditText: EditText
    private lateinit var oksignupButton: Button

    private lateinit var dbRef:DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        nameEditText = findViewById(R.id.nameEditText)
        genderEditText = findViewById(R.id.genderEditText)
        mobileEditText = findViewById(R.id.mobileEditText)
        setpwdEditText = findViewById(R.id.setpwdEditText)
        oksignupButton = findViewById(R.id.oksignupbutton)

        dbRef = FirebaseDatabase.getInstance().getReference("Clients")

        oksignupButton.setOnClickListener{

            saveClientData()
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        }

    }

    private fun saveClientData(){

        //getting editText values.
        val clientName= nameEditText.text.toString()
        val clientGender= genderEditText.text.toString()
        val clientMobile= mobileEditText.text.toString()
        val clientSetPwd= setpwdEditText.text.toString()

        //validating input.
        if (clientName.isEmpty()) {
            nameEditText.error = "Please Enter your Name."
        }

        if (clientGender.isEmpty()) {
            genderEditText.error = "Please Enter your Gender."
        }

        if (clientMobile.isEmpty()) {
            mobileEditText.error = "Please Enter your Phone Number."
        }

        if (clientSetPwd.isEmpty()) {
            setpwdEditText.error = "Please Enter a Password."
        }



        val clientId = dbRef.push().key!!
        val client = ClientModel(clientId, clientName, clientGender, clientMobile, clientSetPwd)

        dbRef.child(clientId).setValue(client)
            .addOnCompleteListener {
                Toast.makeText(this, "Successfully Signed Up!", Toast.LENGTH_LONG).show()

                nameEditText.text.clear()
                genderEditText.text.clear()
                mobileEditText.text.clear()
                setpwdEditText.text.clear()





            }
            .addOnFailureListener{ err->
                Toast.makeText(this, "Error ${err.message}", Toast.LENGTH_LONG).show()
            }
    }
}