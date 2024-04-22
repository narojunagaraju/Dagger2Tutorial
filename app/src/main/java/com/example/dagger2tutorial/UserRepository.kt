package com.example.dagger2tutorial

import android.util.Log
import com.example.dagger2tutorial.Constants.TAG
import javax.inject.Inject


interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SqlRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e(TAG, "saveUser:in sql ")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e(TAG, "saveUser: in firebase")
    }

}