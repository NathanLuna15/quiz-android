package com.example.listadeexercicios

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun exibirResultado(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(color = Color.LightGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
            ,verticalArrangement = Arrangement.Bottom
            ,horizontalAlignment = Alignment.CenterHorizontally,

            )

        {
                Image(
                    painter = painterResource(R.drawable.quiz),
                    contentDescription = "Logo Quiz",
                    modifier = Modifier
                        .size(80.dp)
                )
        }

        Column(
            modifier = Modifier.background(Color(0xFF61DBFB))
                .fillMaxWidth()
                .height(300.dp)
            ,verticalArrangement = Arrangement.Center
            ,horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button (
                onClick = {},
                modifier = Modifier
                    .height(50.dp)
                    .width(170.dp),
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF80C254))


            ) {
                Text(
                    text = "Bom trabalho"
                )

            }
        }

    }
}