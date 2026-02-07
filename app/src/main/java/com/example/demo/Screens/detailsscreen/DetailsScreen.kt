package com.example.demo.Screens.detailsscreen
//
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.graphics.Color
//import androidx.navigation.NavController
//import com.example.demo.cards.Products
//import com.example.demo.R
//
//
//@Composable
//fun DetailedScreen(productId : Int ,navController: NavController){
//
//
//    val products = listOf(
//        Products(id = 1 ,"Epresso" , "Strong and Rich", 20.0 , R.drawable.coffee_2),
//        Products(id = 2 ,"Latte" , "Strong and Rich", 2.0 , R.drawable.coffee_3),
//        Products(id = 3 ,"Cappuccino" , "Strong and Rich", 50.0 , R.drawable.coffee_1),
//        Products(id = 4 ,"mocha" , "Strong and Rich", 25.0 , R.drawable.coffee_4),
//        Products(id = 5 ,"locha" , "Strong and Rich", 23.0 , R.drawable.coffee_5),
//        Products(id = 6 ,"lund" , "Strong and Rich", 29.0 , R.drawable.coffee_6),
//        Products(id = 7 ,"chut special" , "Strong and Rich", 30.0 , R.drawable.coffee_4),
//        Products(id = 8 ,"chut special" , "Strong and Rich", 30.0 , R.drawable.coffee_4),
//    )
//
//    val selectedProducts = products.find { it.id == productId }
//
//    if (selectedProducts == null){
//        Text(text = "product not found",color= Color.Red)
//        return
//    }
//
//    Scaffold(
//        topBar = { DetailedTaB(navController) },
//        bottomBar = { DetailedBaB() }
//    ) { innerPadding ->
//
//        LazyColumn {
//            item{
//                selectedProducts.let {
//                    ProductDetailsContent(
//                        it, innerPadding)
//                }
//
//            }
//        }
//
//
//
//    }
//
//
//
//}

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.demo.cards.Products
import com.example.demo.R

@Composable
fun DetailedScreen(
    productId: Int,
    navController: NavController
) {

    val products = listOf(
        Products(1, "Espresso", "Strong and Rich", 20.0, R.drawable.coffee_2),
        Products(2, "Latte", "Strong and Rich", 2.0, R.drawable.coffee_3),
        Products(3, "Cappuccino", "Strong and Rich", 50.0, R.drawable.coffee_1),
        Products(4, "Mocha", "Strong and Rich", 25.0, R.drawable.coffee_4),
        Products(5, "Locha", "Strong and Rich", 23.0, R.drawable.coffee_5),
        Products(6, "Coffee Special", "Strong and Rich", 29.0, R.drawable.coffee_6),
        Products(7, "Chut Special", "Strong and Rich", 30.0, R.drawable.coffee_4),
        Products(8, "Chut Special", "Strong and Rich", 30.0, R.drawable.coffee_4),
    )

    val selectedProduct = products.find { it.id == productId }

    if (selectedProduct == null) {
        Text(text = "Product not found", color = Color.Red)
        return
    }

    Scaffold(
        topBar = { DetailedTaB(navController) },
        bottomBar = { DetailedBaB() }
    ) { innerPadding ->

        LazyColumn {
            item {
                ProductDetailsContent(selectedProduct, innerPadding)
            }
        }
    }
}

