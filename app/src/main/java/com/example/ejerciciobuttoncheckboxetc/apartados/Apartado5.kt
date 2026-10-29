package com.example.ejerciciobuttoncheckboxetc.apartados

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MySwitch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
    }
}

@Composable
fun MySwitchPantalla(modifier: Modifier = Modifier) {
    var activado by remember { mutableStateOf(false) }
    var mensaje by remember { mutableStateOf("Elige una opción") }
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MySwitch(
            checked = activado,
            onCheckedChange = {activado=it}
        )
        if (activado) {
            MyRadioButton(opcionElegida = {mensaje = "Has elegido $it"})
        }
        MyTextField(
            texto = mensaje,
            onValueChange = {mensaje = it}
        )
    }
}