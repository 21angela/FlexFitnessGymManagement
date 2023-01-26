package com.example.flexfitnessgymmanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.flexfitnessgymmanagement.databinding.ActivityReadClientsBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ReadClients : AppCompatActivity() {

    private lateinit var binding : ActivityReadClientsBinding
    private lateinit var dbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReadClientsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.readdataButton.setOnClickListener {

            val clientMobile : String = binding.mobileEditText.text.toString()
            if (clientMobile.isNotEmpty()){
                readClient(clientMobile)
            }else{
                Toast.makeText(this,"PLease enter Phone Number",Toast.LENGTH_SHORT).show()
            }

        }

    }

    private fun readClient(clientMobile: String) {

        dbRef = FirebaseDatabase.getInstance().getReference("Clients")
        dbRef.child(clientMobile).get().addOnSuccessListener {

            if (it.exists()){

                val clientname = it.child("clientName").value
                val clientgender = it.child("clientGender").value

                Toast.makeText(this,"Successfully Read",Toast.LENGTH_SHORT).show()
                binding.mobileEditText.text.clear()
                binding.nameEditText.text = clientname.toString()
                binding.genderEditText.text = clientgender.toString()


            }else{

                Toast.makeText(this,"User Doesn't Exist",Toast.LENGTH_SHORT).show()


            }

        }.addOnFailureListener{

            Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()


        }



    }
}