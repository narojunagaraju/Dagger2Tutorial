package com.example.dagger2tutorial

import android.util.Log
import com.example.dagger2tutorial.Constants.TAG

interface AnalyticsService {
    fun trackEvent(eventName: String, eventType: String)
}

class MixPanel : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.e(TAG, "trackEvent: ")
    }
}

class FirebaseAnalytics : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.e(TAG, "trackEvent: ")
    }

}