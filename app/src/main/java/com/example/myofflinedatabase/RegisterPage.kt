package com.example.myofflinedatabase

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class RegisterPage : AppCompatActivity() {

    lateinit var name: TextInputEditText
    lateinit var email: TextInputEditText
    lateinit var password: EditText
    lateinit var submit: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        submit = findViewById(R.id.submit)



        submit.setOnClickListener {
            Log.d("=======", "onCreate: ${name.text}")
            Log.d("=======", "onCreate: ${email.text}")
            Log.d("=======", "onCreate: ${password.text}")


            var MyDatbaseclass = MyDatbaseclass(this@RegisterPage)


            MyDatbaseclass.InsertData(name.text.toString(),email.text.toString(),password.text.toString())

            startActivity(Intent(this@RegisterPage,LoginPage::class.java))
            finish()
        }




    }
}