package com.example.dagger2tutorial

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule() {
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