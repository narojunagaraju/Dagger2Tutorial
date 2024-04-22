package com.example.dagger2tutorial

import android.util.Log
import com.example.dagger2tutorial.Constants.TAG
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun send(to: String, from: String) {
        Log.e(TAG, "send: ")
    }
}