package com.example.demo.Screens.HomeScreens

import androidx.compose.foundation.Image
import com.example.demo.R

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.demo.cards.Products
import com.example.demo.navigation.Routes
import com.example.demo.ui.theme.IvoryWhite
import com.example.demo.ui.theme.LightB
import com.example.demo.ui.theme.LightG


@Composable
fun ProductCards(
    product : Products,
    modifier: Modifier = Modifier,
    navController: NavController
){

    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable{ navController.navigate(Routes.DetailScreen(productId = product.id))}
            .padding(8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = LightG
                .copy(alpha= 0.5f)
        )

    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
            ){
                Image(painter = painterResource(product.imageRes),
                    contentDescription = "product image",
                contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(24.dp))
                )
                
                Box(
                    modifier= Modifier.align(Alignment.TopEnd)

                        .padding(8.dp)

                        .background(
                        color= LightG.copy(alpha = 0.6f),
                        shape = RoundedCornerShape(8.dp)
                        )
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ){
                        Icon(
                            painter = painterResource(R.drawable.regular_outline_heart),
                            contentDescription = "fav",
                            tint = LightB,
                            modifier= Modifier.size(24.dp)

                            )
                }


            }
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = product.name,
                style = typography.titleMedium.copy(
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold
                )
            )

            Text(
                text = product.description,
                style = typography.bodySmall.copy(
                    color = Color.Black,

                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

                Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$${product.price}",
                    style = typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = LightB
                    )
                )
                IconButton(
                    onClick = {},
                    modifier = Modifier.background(
                        color=LightB,
                        shape = RoundedCornerShape(10.dp)
                    )
                ) {
                    Icon(imageVector = Icons.Default.Add,
                        contentDescription = "add to cart",
                        tint = IvoryWhite
                    )

                }

            }



            }
        }
    }
