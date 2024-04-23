package com.kotlinstudy.introduce.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.kotlinstudy.introduce.IntroduceScreen

fun NavController.navigateIntroduce() {
    navigate(IntroduceRoute.route)
}


object IntroduceRoute {
    const val route = "Introduce"
}