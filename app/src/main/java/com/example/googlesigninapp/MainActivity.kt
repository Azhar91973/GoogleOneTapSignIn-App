package com.example.googlesigninapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.googlesigninapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvname.text = "UserName :- " + LoginActivity.auth.currentUser?.displayName.toString()
        binding.tvemail.text = "UserEmail :- " + LoginActivity.auth.currentUser?.email.toString()
    }

    fun signOut(view: View) {
        LoginActivity.auth.signOut()
        finish()
        startActivity(Intent(this, LoginActivity::class.java))
    }
}
