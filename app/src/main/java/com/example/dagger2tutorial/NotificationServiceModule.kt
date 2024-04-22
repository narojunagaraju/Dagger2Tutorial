package com.example.dagger2tutorial

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {
    @MessageQualifier
    @Provides
    fun getNotificationService(): NotificationService {
        return MessagingService()
    }


    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}