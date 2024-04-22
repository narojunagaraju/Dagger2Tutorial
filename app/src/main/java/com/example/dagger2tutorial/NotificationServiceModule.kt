package com.example.dagger2tutorial

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NotificationServiceModule() {
    @Singleton
    @MessageQualifier
    @Provides
    fun getNotificationService(retryCount: Int): NotificationService {
        return MessagingService(retryCount)
    }


    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}