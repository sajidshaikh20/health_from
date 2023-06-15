package com.example.health_from

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    val editTextName = findViewById<EditText>(R.id.UserNameEdt)
    val editTextSName = findViewById<EditText>(R.id.UserSurNameEdt)
    val editTextEmail = findViewById<EditText>(R.id.UserSurEmail)
    val editTextNum = findViewById<EditText>(R.id.UserContact)
    val editTextDob = findViewById<EditText>(R.id.UserDob)
    val radiobtnMAle = findViewById<RadioButton>(R.id.Male)
    val radiobtnfemale = findViewById<RadioButton>(R.id.Female)
    val radiobtnfvr =  findViewById<RadioButton>(R.id.fever)
    val rdobtnmaleria = findViewById<RadioButton>(R.id.Maleria)
    val rdobtncldcou =  findViewById<RadioButton>(R.id.Cold)
    val sbmtbutton = findViewById<MaterialButton>(R.id.SubmitButton)
    val rstbutton = findViewById<MaterialButton>(R.id.ResetButton)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      // reset button handler
        rstbutton.setOnClickListener {
            editTextName.text.clear()
            editTextSName.text.clear()
            editTextEmail.text.clear()
            editTextNum.text.clear()
            editTextDob.text.clear()
        }
    }
}