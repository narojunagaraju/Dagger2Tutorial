package com.example.dagger2tutorial

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dagger2tutorial.Constants.TAG
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService1: EmailService

    @Inject
    lateinit var emailService2: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val userRegistrationComponent = (application as UserApplication).userRegistrationComponent
        userRegistrationComponent.inject(this)
        userRegistrationService.registerUser("hello@test.com", "hello")
        Log.e(TAG, "onCreate: $emailService1 $emailService2")
    }
}