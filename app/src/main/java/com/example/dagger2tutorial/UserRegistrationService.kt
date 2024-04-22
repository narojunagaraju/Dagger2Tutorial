package com.example.dagger2tutorial

class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send("a@gmail.com", "b@gmail.com")
    }
}