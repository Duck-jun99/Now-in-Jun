package com.kotlinstudy.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.kotlinstudy.designsystem.CleanArchitectureTheme
import com.kotlinstudy.project.navigation.ProjectRoute
import com.kotlinstudy.project.navigation.navigateProject
import com.kotlinstudy.project.navigation.projectNavGraph
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Surface(
                color = MaterialTheme.colorScheme.background
            ) {


                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = ProjectRoute.route
                ) {
                    projectNavGraph(
                        onSettingClick = { navController.navigateProject() }
                    )
                    /*
                    signInNavGraph(
                        onLoginClick = { navController.navigateLogin() }
                    )
                    
                     */
                }


            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CleanArchitectureTheme {

    }
}