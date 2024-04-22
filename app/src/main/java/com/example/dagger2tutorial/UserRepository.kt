package com.example.dagger2tutorial

import android.util.Log
import com.example.dagger2tutorial.Constants.TAG
import javax.inject.Inject
import javax.inject.Singleton


interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SqlRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e(TAG, "saveUser:in sql ")
        analyticsService.trackEvent("Save user", "create")
    }
}

class FirebaseRepository(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e(TAG, "saveUser: in firebase")
        analyticsService.trackEvent("Save user", "create")
    }

}