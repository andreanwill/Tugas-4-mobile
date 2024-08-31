package com.WIll.tugas4mobile

import android.content.Intent
import android.os.Bundle
import android.text.style.ClickableSpan
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    private lateinit var login : Button
    private lateinit var username : EditText
    private lateinit var pass : EditText
    private lateinit var forgot : ClickableSpan
    private lateinit var signup : ClickableSpan


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.btnLogin)
        username = findViewById(R.id.txtUsername)
        pass = findViewById(R.id.txtPass)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main))
        { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        login.setOnClickListener()
        {
            val user =username.text.toString()
            val pass = pass.text.toString()

            if(user=="admin" && pass=="123456")
            {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this, "Invalid Password or Username", Toast.LENGTH_SHORT).show()
            }
        }
    }
}