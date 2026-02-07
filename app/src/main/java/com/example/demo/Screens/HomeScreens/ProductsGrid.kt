package com.example.demo.Screens.HomeScreens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.demo.cards.Products
import androidx.compose.foundation.lazy.items
import androidx.navigation.NavController


@Composable
fun ProductsGrid(
    products: List<Products>,

    navController: NavController,
    topContent : @Composable () -> Unit
){
    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .padding(8.dp)
    ) {
//        items(products.chunked(2)){ rowItems ->
//            ProductCards()
//        }
        item {
            topContent()
        }
        items(products.chunked(2)) { rowItems ->

            Row(
                modifier = Modifier.fillMaxWidth()

            ) {
                ProductCards(
                    product = rowItems[0],
                    modifier = Modifier.weight(1f),
                    navController = navController
                )

                if (rowItems.size == 2){
                    ProductCards(
                        product = rowItems[1],
                        modifier = Modifier.weight(1f),
                        navController = navController
                    )
                }else{
                    Spacer(modifier = Modifier.weight(1f))
                }

            }
        }
    }
}