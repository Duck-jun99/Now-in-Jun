package com.kotlinstudy.project.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.kotlinstudy.project.ProjectScreen

fun NavController.navigateProject() {
    navigate(ProjectRoute.route)
}

fun NavGraphBuilder.projectNavGraph(
    onSettingClick: (Int) -> Unit
) {
    composable(route = ProjectRoute.route) {
        ProjectScreen(
            onSettingClick = onSettingClick
        )
    }
}

object ProjectRoute {
    const val route = "project"
}