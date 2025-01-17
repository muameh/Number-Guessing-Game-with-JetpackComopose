package com.mehmetbaloglu.jetpackcomposelessonsbeginnerlevel

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun GirisEkrani(navController: NavController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Tahmin Oyunu",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color = Color(0xFF713713),
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(10.dp),
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = painterResource(id = R.drawable.baseline_casino_24),
            contentDescription = "resim açıklaması buraya"
        )
        Button(
            onClick = { navController.navigate("tahminEkrani") },
            colors = ButtonDefaults.buttonColors(Color(0xDD713713)),
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier.size(250.dp, 50.dp)
        ) {
            Text(
                text = "Oyuna başla", fontSize = 20.sp, color = Color.White
            )
        }
    }
}
