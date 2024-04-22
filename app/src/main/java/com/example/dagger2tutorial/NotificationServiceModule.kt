package com.example.dagger2tutorial

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getNotificationService(): NotificationService {
        return MessagingService()
    }
}