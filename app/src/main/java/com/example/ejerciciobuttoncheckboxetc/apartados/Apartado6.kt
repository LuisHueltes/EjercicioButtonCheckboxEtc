package com.example.ejerciciobuttoncheckboxetc.apartados

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@Composable
fun MyRadioButton(opcionElegida: (String) -> Unit) {
    var selected by remember { mutableStateOf("") }
    val options = listOf("Coche","Moto","Tren")
    Column {
        options.forEach {
            MyRadioButtonItem(it, selected) {
                opcion -> selected = opcion
                opcionElegida(opcion)
            }
        }
    }
}

@Composable
fun MyRadioButtonItem(opcion:String, selected:String, onSelected:(String)-> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = selected == opcion,
            onClick = {onSelected(opcion)}
        )
        Text(text=opcion)
    }
}