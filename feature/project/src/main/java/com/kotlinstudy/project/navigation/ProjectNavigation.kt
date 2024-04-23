package com.kotlinstudy.project.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.kotlinstudy.project.ProjectScreen

fun NavController.navigateProject() {
    navigate(ProjectRoute.route)
}


object ProjectRoute {
    const val route = "Project"
}