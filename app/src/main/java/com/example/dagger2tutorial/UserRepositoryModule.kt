package com.example.dagger2tutorial

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun bindSqlRepository(sqlRepository: SqlRepository): UserRepository
}