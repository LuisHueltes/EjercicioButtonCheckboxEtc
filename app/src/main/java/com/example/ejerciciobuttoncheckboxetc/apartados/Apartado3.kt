package com.example.ejerciciobuttoncheckboxetc.apartados

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MyCheckBox(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
        Text("Activar")
    }
}

@Composable
fun MyCheckBoxPantalla(modifier: Modifier = Modifier) {
    var activado by remember { mutableStateOf(false) }
    var mensaje by remember { mutableStateOf("Mensaje oculto") }

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyCheckBox(
            checked = activado,
            onCheckedChange = {activado=it}
        )
        if (activado) {
            MyTextField(
                texto = mensaje,
                onValueChange = {mensaje=it}
            )
        }
    }
}