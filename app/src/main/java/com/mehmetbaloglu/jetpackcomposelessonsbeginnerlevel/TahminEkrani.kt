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
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mehmetbaloglu.jetpackcomposelessonsbeginnerlevel.ui.theme.JetpackComposeLessonsBeginnerLevelTheme


@Composable
fun TahminEkranı(navController: NavController) {

    var tahmin = remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Kalan hak : 5 ",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color = Color(0xFF713713),
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(10.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Yardım : Arttır",
            fontSize = 25.sp,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Normal,
            modifier = Modifier.padding(10.dp),
            fontWeight = FontWeight.Bold
        )
       TextField(
           value = tahmin.value, onValueChange = {tahmin.value = it},
           label = { Text(text = "tahmininiz ?") }
       )
        Button(
            onClick = { navController.navigate("sonucEkrani") {popUpTo("tahminEkrani")} },
            colors = ButtonDefaults.buttonColors(Color(0xDD713713)),
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier.size(250.dp, 50.dp)
        ) {
            Text(
                text = "TAHMİN ET", fontSize = 20.sp, color = Color.White
            )
        }
    }
}

