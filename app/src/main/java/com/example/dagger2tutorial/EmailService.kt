package com.example.dagger2tutorial

import android.util.Log
import com.example.dagger2tutorial.Constants.TAG
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

class EmailService @Inject constructor() : NotificationService {

    override fun send(to: String, from: String, body: String?) {
        Log.e(TAG, "Email sent: ")
    }
}

class MessagingService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.e(TAG, "Message sent: ")
    }


}