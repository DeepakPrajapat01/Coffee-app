package com.example.demo.navigation

import androidx.navigation.NavHostController
import kotlinx.serialization.Serializable

sealed class Routes {

    @Serializable
    object WelcomeScreen : Routes()

    @Serializable
    object HomeScreen : Routes()

    @Serializable
    data class DetailScreen(
        val productId: Int
    ) : Routes()
}