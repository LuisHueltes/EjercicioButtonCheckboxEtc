package com.example.ejerciciobuttoncheckboxetc.apartados

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ejerciciobuttoncheckboxetc.R

@Composable
fun MyImage(imagen: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = imagen),
        contentDescription =  "Imagen",
        modifier = modifier
    )
}

@Composable
fun MyImagePantalla(modifier: Modifier = Modifier) {
    val imagenes = listOf(R.drawable.coche, R.drawable.moto, R.drawable.tren)
    var indice by remember { mutableStateOf(0) }

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyImage(
            imagen = imagenes[indice],
            modifier = Modifier.size(100.dp)
        )
        MyButton(onClick = { indice = (indice + 1) % imagenes.size })
    }
}