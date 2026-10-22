package com.example.listadeexercicios

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listadeexercicios.ui.theme.ListaDeExerciciosTheme
import kotlinx.coroutines.sync.Mutex

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListaDeExerciciosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    exibirResultado(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun Quiz(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFF61DBFB))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.quiz),
                contentDescription = "Logo Quiz",
                modifier = Modifier
                    .size(200.dp)
            )
        }

        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(0.dp, 50.dp)
                .height(300.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(
                text = "QUIZTRON 3000",
                fontSize = 40.sp
            )

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = {
                },

                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(50),
                border = BorderStroke(1.5.dp, Color.Black),
                modifier = Modifier.fillMaxWidth()
                    .height(50.dp)


            ) {
                Text(
                    text = "CALCULAR",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 14.sp
                )
            }

        }

    }
}