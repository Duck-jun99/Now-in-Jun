package com.kotlinstudy.data.di

import com.kotlinstudy.data.repository.DefaultUserRepository
import com.kotlinstudy.data.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindsUserRepository(
        userRepository: DefaultUserRepository
    ): UserRepository
}