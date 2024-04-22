package com.kotlinstudy.data.repository

import com.kotlinstudy.database.dao.UserDao
import com.kotlinstudy.database.model.User
import javax.inject.Inject

class DefaultUserRepository @Inject constructor(
    private val userDao: UserDao
) : UserRepository {

    /*
    override suspend fun insertUser(user: User) {
        userDao.insertUser(user)
    }

     */

}