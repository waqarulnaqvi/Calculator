package com.syedwaqarul.calculator.ui.theme.CalculatorScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.syedwaqarul.calculator.UiState
import com.syedwaqarul.calculator.ui.theme.CalculatorTheme

@Composable
fun CalculatorScreen(uiState: UiState= UiState(),
                     onEvent: (CalculatorEvent)->Unit={}) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(20.dp,0.dp)
            .fillMaxSize()
    ) {
        TextField(value = "", onValueChange = {},
            modifier = Modifier
//                .padding(24.dp)
                .fillMaxWidth()
        , label = {Text(text="Number 1:")}
        )

        TextField(value = "", onValueChange = {},
            modifier = Modifier
//                .padding(24.dp)
                .fillMaxWidth()

            , label = {Text(text="Number 1:")}

        )

        Spacer(modifier = Modifier.height(24.dp))

        Row {

            ElevatedButton(onClick = { /*TODO*/ },
                colors = ButtonDefaults.elevatedButtonColors(containerColor = Color.Black,
                    contentColor = MaterialTheme.colorScheme.onPrimary),
                modifier = Modifier
                    .weight(1f)
                    .padding(10.dp, 0.dp)
                ) {
                Text(text = "+")
                
            }
            ElevatedButton(onClick = { /*TODO*/ },
                colors = ButtonDefaults.elevatedButtonColors(containerColor = Color.Green,
                    contentColor = MaterialTheme.colorScheme.onPrimary),
                modifier = Modifier
                    .weight(1f)
                    .padding(10.dp, 0.dp)

                ) {
                Text(text = "-")
            }
            ElevatedButton(onClick = { /*TODO*/ },
                colors = ButtonDefaults.elevatedButtonColors(containerColor = Color.Yellow,
                    contentColor = MaterialTheme.colorScheme.onPrimary),
                modifier = Modifier
                    .weight(1f)
                    .padding(10.dp, 0.dp)


                ) {
                Text(text = "*")
            }
            ElevatedButton(onClick = { /*TODO*/ },
                colors = ButtonDefaults.elevatedButtonColors(containerColor = Color.Blue,
                    contentColor = MaterialTheme.colorScheme.onPrimary),
                modifier = Modifier
                    .weight(1f)
                    .padding(10.dp, 0.dp)

                ) {
                Text(text = "/")
            }

        }

        Spacer(modifier = Modifier.height(24.dp))
        ElevatedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.elevatedButtonColors(containerColor = Color.Red,
                contentColor = MaterialTheme.colorScheme.onPrimary
            ),
            modifier = Modifier

                .fillMaxWidth()
                .padding(20.dp, 0.dp)
//            .background(Color.Green)
        ) {
            Text(text = "Clear")
            
        }
        Text(text = "Result",
        style = MaterialTheme.typography.displayLarge)
    }
}

@Preview(showSystemUi = true)
@Composable
fun CalculatorScreenPrev() {
    CalculatorTheme {
        CalculatorScreen()
    }

}