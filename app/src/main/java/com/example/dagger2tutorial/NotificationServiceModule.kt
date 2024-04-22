package com.example.dagger2tutorial

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule(private val retryCount: Int) {
    @MessageQualifier
    @Provides
    fun getNotificationService(): NotificationService {
        return MessagingService(retryCount)
    }


    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}