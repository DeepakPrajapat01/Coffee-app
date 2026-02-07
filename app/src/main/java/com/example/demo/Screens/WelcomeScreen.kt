package com.example.demo.Screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.demo.R

import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.demo.navigation.Routes
import com.example.demo.ui.theme.LightB



@Composable
fun WelcomeScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.Black
            )

    ) {

        Image(
            painter = painterResource(id = R.drawable.image_splash),
            contentDescription = "Welcome"

        )

        Column(
            modifier = Modifier.fillMaxSize().padding(vertical = 70.dp, horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,

        ) {

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Welcome to My App",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Start your journey with us today",
                fontSize = 16.sp,
                color = Color.LightGray.copy(alpha = 0.85f),
                textAlign = TextAlign.Center

            )

            Spacer(modifier = Modifier.height(50.dp))

            Button(
                onClick = {navController.navigate(Routes.HomeScreen)},
                shape = RoundedCornerShape(14.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = LightB,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Get Started",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
