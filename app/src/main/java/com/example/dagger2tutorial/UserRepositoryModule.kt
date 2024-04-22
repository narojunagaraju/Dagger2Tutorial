package com.example.dagger2tutorial

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindSqlRepository(sqlRepository: SqlRepository): UserRepository
}