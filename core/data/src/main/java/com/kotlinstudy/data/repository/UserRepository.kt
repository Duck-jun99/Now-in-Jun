package com.kotlinstudy.data.repository

import com.kotlinstudy.database.model.User

interface UserRepository {

    suspend fun insertUser(user: User)

    suspend fun getUserByEmail(email: String): User?
}