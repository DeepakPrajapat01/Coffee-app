package com.example.demo.Screens.detailsscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.ui.theme.LightB
import com.example.demo.ui.theme.LightG


@Composable
fun SelectSize(sizeText : String, selected: Boolean,onClick:() -> Unit,modifier: Modifier){
    Box(
        modifier = modifier
            .background(
                color = if (selected) LightG else Color.White,
                shape = RoundedCornerShape(12.dp)
            )
            .border(
                width = 1.dp ,
                shape = RoundedCornerShape(12.dp),
                color = if (selected) Color(0xFFC67C4E)  else Color(0xFFE1E1E1),

            )
            //.clip(RoundedCornerShape(12.dp))
            .clickable{onClick()}
            .height(46.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = sizeText,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = if (selected) LightB else Color.Black,


        )
    }
}



