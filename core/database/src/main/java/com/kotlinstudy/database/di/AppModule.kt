package com.kotlinstudy.database.di

import android.content.Context
import com.kotlinstudy.database.AppDatabase
import com.kotlinstudy.database.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ): AppDatabase = AppDatabase.getDatabase(context)


    @Singleton
    @Provides
    fun provideRepository(database: AppDatabase
    ): UserDao = database.userDao
}