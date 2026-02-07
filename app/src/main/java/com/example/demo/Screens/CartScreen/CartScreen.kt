package com.example.demo.Screens.CartScreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.demo.R
import com.example.demo.cards.Products

@Preview(showBackground = true)
@Composable
fun CartScreen() {
    val products = listOf(
        Products(1, "Espresso", "Strong and Rich", 20.0, R.drawable.coffee_2),
        Products(2, "Latte", "Strong and Rich", 2.0, R.drawable.coffee_3),
        Products(3, "Cappuccino", "Strong and Rich", 50.0, R.drawable.coffee_1)
    )
}