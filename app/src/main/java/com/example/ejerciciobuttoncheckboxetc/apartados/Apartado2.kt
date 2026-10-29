package com.example.ejerciciobuttoncheckboxetc.apartados

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MyTextField(
    texto : String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        value = texto,
        onValueChange = onValueChange,
        readOnly = true,
        modifier = modifier
    )
}

@Composable
fun MyTextFieldPantalla(modifier: Modifier= Modifier) {
    var mensajeVisible by remember { mutableStateOf(false) }
    var mensaje by remember { mutableStateOf("Mensaje oculto") }

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if(mensajeVisible) {
            MyTextField(
                texto = mensaje,
                onValueChange = { mensaje=it }
            )
        }
    }
}