package com.example.ejerciciobuttoncheckboxetc.apartados

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun MyButton(onClick: () -> Unit, modifier : Modifier = Modifier) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(20.dp)
    ) {
        Text("Presionar")
    }
}

@Composable
fun MyProgressIndicator() {
    CircularProgressIndicator(
        color = Color.Blue,
        strokeWidth = 5.dp
    )

}

@Composable
fun MyText(modifier: Modifier = Modifier) {
    var texto by remember { mutableStateOf("") }
    var cargando by remember { mutableStateOf(false) }

    if (cargando) {
        LaunchedEffect(Unit) {
            delay(5000)
            cargando = false
        }
    }

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyTextField(
            texto = texto,
            onValueChange = { texto = it }
        )
        if (cargando) {
            MyProgressIndicator()
        }
        MyButton(onClick = {
            texto = "Botón presionado"
            cargando = true
        })
    }
}