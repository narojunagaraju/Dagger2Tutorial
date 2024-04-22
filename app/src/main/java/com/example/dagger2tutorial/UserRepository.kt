package com.example.dagger2tutorial

import android.util.Log
import com.example.dagger2tutorial.Constants.TAG
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email: String, password: String) {
        Log.e(TAG, "saveUser: ")
    }
}