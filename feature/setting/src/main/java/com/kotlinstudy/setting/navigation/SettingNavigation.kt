package com.kotlinstudy.setting.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.kotlinstudy.setting.SettingScreen

fun NavController.navigateSetting() {
    navigate(SettingRoute.route)
}


object SettingRoute {
    const val route = "Setting"
}