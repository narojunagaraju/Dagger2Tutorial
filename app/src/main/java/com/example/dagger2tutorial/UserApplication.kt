package com.example.dagger2tutorial

import android.app.Application

class UserApplication : Application() {
    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()
        //Singleton injections like EmailService are singleton only within the component level.
        //If you create 2 components you will get 2 diff objects
        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)

    }
}