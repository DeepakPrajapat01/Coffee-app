package com.example.demo.Screens.detailsscreen
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.HorizontalDivider
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Text
//import com.example.demo.R
//
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.demo.cards.Products
//import com.example.demo.ui.theme.IvoryWhite
//import com.example.demo.ui.theme.LightG
//
//@Composable
//fun ProductDetailsContent(product: Products, innerPadding: PaddingValues){
//    Column(
//        modifier = Modifier.fillMaxSize()
//            .padding(16.dp)
//            .padding(innerPadding)
//    ) {
//
//        Image(
//            painter = painterResource(id = product.imageRes),
//            contentDescription = product.name,
//            modifier = Modifier.fillMaxWidth()
//                .height(250.dp)
//                .clip(RoundedCornerShape(16.dp)),
//            contentScale = ContentScale.Crop
//        )
//
//        Spacer(modifier = Modifier.height(12.dp))
//
//        Text(
//            text = product.name,
//            fontSize = 24.sp,
//        )
//        Spacer(modifier = Modifier.height(12.dp))
//
//        Row() {
//            Text(text = "Ice / Hot")
//
//            Icon(painter = painterResource(R.drawable.default_bean),
//                contentDescription = "bean",
//                modifier = Modifier.background(
//                    color = IvoryWhite,
//                    shape = RoundedCornerShape(10.dp)
//                )
//                    .size(36.dp)
//                    .padding(6.dp)
//            )
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        HorizontalDivider(
//            color = Color.LightGray.copy(alpha = 0.5f)
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Text(
//            text = product.description,
//            fontSize = 24.sp,
//            fontWeight = FontWeight.Bold,
//        )
//
//        Text(
//            text = "Ice / Hot",
//            fontSize = 16.sp,
//            color = LightG,
//            fontWeight = FontWeight.Medium
//            )
//
//        Spacer(modifier = Modifier.height(24.dp))
//
//        Text(
//            text = "Size",
//            fontSize = 24.sp,
//            fontWeight = FontWeight.Bold,
//        )
//        Spacer(modifier = Modifier.height(10.dp))
//
//        var selectedSizeText by remember { mutableStateOf("M") }
//
//        Row(
//           modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.spacedBy(30.dp)
//        ) {
//
//            listOf("S","M","L").forEach { size ->
//                SelectSize(
//                    sizeText = size,
//                    selected = selectedSizeText == size,
//                    onClick = { selectedSizeText = size },
//                    Modifier.weight(1f).height(46.dp)
//                )
//            }
//
////            val listof = Unit
//        }
//    }
//
//}
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.R
import com.example.demo.cards.Products
import com.example.demo.ui.theme.IvoryWhite
import com.example.demo.ui.theme.LightG
import java.nio.file.WatchEvent

@Composable
fun ProductDetailsContent(
    product: Products,
    innerPadding: PaddingValues
) {

    var selectedSizeText by remember { mutableStateOf("M") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(16.dp)
    ) {

        Image(
            painter = painterResource(product.imageRes),
            contentDescription = product.name,
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = product.name,
            fontSize = 24.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Ice / Hot")

            Icon(
                painter = painterResource(R.drawable.default_bean),
                contentDescription = "bean",
                modifier = Modifier
                    .background(IvoryWhite, RoundedCornerShape(10.dp))
                    .size(36.dp)
                    .padding(6.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        HorizontalDivider(color = Color.LightGray.copy(alpha = 0.5f))

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Description",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = product.description,
            fontSize = 16.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Medium
        )



        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Size",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(30.dp)
        ) {

            listOf("S", "M", "L").forEach { size ->
                SelectSize(
                    sizeText = size,
                    selected = selectedSizeText == size,
                    onClick = { selectedSizeText = size },
                    modifier = Modifier
                        .weight(1f)
                        .height(46.dp)
                )
            }
        }
    }
}


