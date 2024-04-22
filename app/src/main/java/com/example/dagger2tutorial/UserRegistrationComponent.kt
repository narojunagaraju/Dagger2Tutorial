package com.example.dagger2tutorial

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService

    fun getEmailService(): EmailService
}