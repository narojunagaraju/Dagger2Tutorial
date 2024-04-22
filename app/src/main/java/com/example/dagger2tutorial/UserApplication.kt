package com.example.dagger2tutorial

import android.app.Application

class UserApplication : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        //Singleton injections like EmailService are singleton only within the component level.
        //If you create 2 components you will get 2 diff objects
        appComponent = DaggerAppComponent.builder().build()

    }
}