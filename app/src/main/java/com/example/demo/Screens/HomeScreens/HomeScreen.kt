package com.example.demo.Screens.HomeScreens



//import androidx.compose.foundation.ExperimentalFoundationApi
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxHeight
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.KeyboardArrowDown
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.demo.cards.Products
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.material3.*
//import androidx.compose.foundation.clickable
//import com.example.demo.R
//
//import androidx.navigation.NavController
//import com.example.demo.MyBottomNavBar
//
//
//
//
//@Composable
//@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
//fun HomeScreen(
//    navController: NavController
//) {
//
//    var expanded by remember { mutableStateOf(false) }
//    var selectedLocation by remember { mutableStateOf("Bhankrota, Jaipur") }
//    val location = listOf(
//        "Bhankrota, Jaipur",
//        "Vaishali Nagar, Jaipur",
//        "Mansarovar, Jaipur",
//        "Ajmer Road, Jaipur",
//        "Tonk Road, Jaipur"
//    )
//
//
//    Scaffold(
//        bottomBar = { MyBottomNavBar() }
//    ) { innePadding ->
//            Box(
//                modifier = Modifier.fillMaxWidth().fillMaxHeight(1f / 3f)
//                    .background(
//                        brush = Brush.linearGradient(
//                            colors = listOf(
//                                Color(0xFF303030),
//                                Color(0xFF1F1F1F),
//                                Color(0xFf121212)
//                            )
//                        )
//                    )
//            )
//
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(16.dp)
//                    .padding(innePadding)
//            ) {
//
////                products
//
//                val products = listOf(
//                    Products( 1 ,"Epresso" , "Strong and Rich", 20.0 , R.drawable.coffee_2),
//                    Products(2 ,"Latte" , "Strong and Rich", 2.0 , R.drawable.coffee_3),
//                    Products( 3 ,"Cappuccino" , "Strong and Rich", 50.0 , R.drawable.coffee_1),
//                    Products( 4 ,"mocha" , "Strong and Rich", 25.0 , R.drawable.coffee_4),
//                    Products( 5 ,"locha" , "Strong and Rich", 23.0 , R.drawable.coffee_5),
//                    Products( 6 ,"lund" , "Strong and Rich", 29.0 , R.drawable.coffee_6),
//                    Products( 7 ,"chut special" , "Strong and Rich", 30.0 , R.drawable.coffee_4),
//                    Products( 8 ,"chut special" , "Strong and Rich", 30.0 , R.drawable.coffee_4),
//                )
//
//                ProductsGrid(
//                    products = products,
//                ) {
//                    Text(
//                        text = "Location",
//                        color = Color.Gray,
//                        fontSize = 14.sp
//                    )
//
//                    Spacer(modifier = Modifier.height(4.dp))
//
//                    Row(
//                        verticalAlignment = Alignment.CenterVertically
//                    ) {
//                        ExposedDropdownMenuBox(
//                            expanded = expanded,
//                            onExpandedChange = { expanded = !expanded }
//                        ) {
//
//                            Row(
//                                modifier = Modifier
//                                    .menuAnchor(
//                                        type = MenuAnchorType.PrimaryNotEditable,
//                                enabled = true
//                            )
//
//                                .clickable { expanded = true },
//                                verticalAlignment = Alignment.CenterVertically
//                            ) {
//                                Text(
//                                    text = selectedLocation,
//                                    color = Color.White,
//                                    fontWeight = FontWeight.Bold,
//                                    fontSize = 16.sp
//                                )
//
//                                Icon(
//                                    imageVector = Icons.Default.KeyboardArrowDown,
//                                    contentDescription = null,
//                                    tint = Color.White
//                                )
//                            }
//
//                            ExposedDropdownMenu(
//                                expanded = expanded,
//                                onDismissRequest = { expanded = false }
//                            ) {
//                                location.forEach { location ->
//                                    DropdownMenuItem(
//                                        text = { Text(location) },
//                                        onClick = {
//                                            selectedLocation = location
//                                            expanded = false
//                                        }
//                                    )
//                                }
//                            }
//                        }
//                    }
//                    Spacer(modifier = Modifier.height(40.dp))
//
//                    MySearchBar()
//
//                    Spacer(modifier = Modifier.height(40.dp))
//
//                    Image(
//                        painter = painterResource(R.drawable.banner_1),
//                        contentDescription = "Home banner"
//                    )
//                    Spacer(modifier = Modifier.height(16.dp))
//
//                    HMcategories()
//
//                    Spacer(modifier = Modifier.height(20.dp))
//                }
//
//
//            }
//        }
//    }

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.demo.MyBottomNavBar
import com.example.demo.R
import com.example.demo.cards.Products

@Composable
@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
fun HomeScreen(
    navController: NavController
) {

    var expanded by remember { mutableStateOf(false) }
    var selectedLocation by remember { mutableStateOf("Bhankrota, Jaipur") }

    val locations = listOf(
        "Bhankrota, Jaipur",
        "Vaishali Nagar, Jaipur",
        "Mansarovar, Jaipur",
        "Ajmer Road, Jaipur",
        "Tonk Road, Jaipur"
    )

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

    Scaffold(
        bottomBar = { MyBottomNavBar() }
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f / 3f)
                .background(
                    Brush.linearGradient(
                        listOf(
                            Color(0xFF303030),
                            Color(0xFF1F1F1F),
                            Color(0xFF121212)
                        )
                    )
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {

            ProductsGrid(products = products , navController = navController) {

                Text("Location", color = Color.Gray, fontSize = 14.sp)

                Spacer(modifier = Modifier.height(4.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {

                    ExposedDropdownMenuBox(
                        expanded = expanded,
                        onExpandedChange = { expanded = !expanded }
                    ) {

                        Row(
                            modifier = Modifier
                                .menuAnchor(
                                    type = MenuAnchorType.PrimaryNotEditable,
                                    enabled = true
                                )
                                .clickable { expanded = true },
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Text(
                                text = selectedLocation,
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )

                            Icon(
                                Icons.Default.KeyboardArrowDown,
                                contentDescription = null,
                                tint = Color.White
                            )
                        }

                        ExposedDropdownMenu(
                            expanded = expanded,
                            onDismissRequest = { expanded = false }
                        ) {

                            locations.forEach { location ->

                                DropdownMenuItem(
                                    text = { Text(location) },
                                    onClick = {
                                        selectedLocation = location
                                        expanded = false
                                    }
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(40.dp))

                MySearchBar()

                Spacer(modifier = Modifier.height(40.dp))

                Image(
                    painter = painterResource(R.drawable.banner_1),
                    contentDescription = "Home banner"
                )

                Spacer(modifier = Modifier.height(16.dp))

                HMcategories()

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

