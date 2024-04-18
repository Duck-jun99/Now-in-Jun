package com.kotlinstudy.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kotlinstudy.database.model.User

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM user WHERE email = :email")
    suspend fun getUserByEmail(email: String): User?
}