package com.kotlinstudy.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
    @PrimaryKey val email: String,
    val password: String
)

class InvalidUserException(message: String): Exception(message)