package com.example.demo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.demo.Screens.HomeScreens.HomeScreen
import com.example.demo.Screens.WelcomeScreen
import com.example.demo.Screens.detailsscreen.DetailedScreen

@Composable
fun NavGraph(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.WelcomeScreen){
        composable<Routes.WelcomeScreen>{
            WelcomeScreen(navController)
        }
        composable<Routes.HomeScreen>{
            HomeScreen(navController)
        }

        composable<Routes.DetailScreen> { backStackEntry ->

            val args = backStackEntry.toRoute<Routes.DetailScreen>()

            DetailedScreen(
                productId = args.productId,
                navController = navController
            )
        }
    }


}