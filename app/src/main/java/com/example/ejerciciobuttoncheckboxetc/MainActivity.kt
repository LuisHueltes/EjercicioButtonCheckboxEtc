package com.example.ejerciciobuttoncheckboxetc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejerciciobuttoncheckboxetc.apartados.MyCheckBoxPantalla
import com.example.ejerciciobuttoncheckboxetc.apartados.MyIcon
import com.example.ejerciciobuttoncheckboxetc.apartados.MyImagePantalla
import com.example.ejerciciobuttoncheckboxetc.apartados.MySwitchPantalla
import com.example.ejerciciobuttoncheckboxetc.apartados.MyText
import com.example.ejerciciobuttoncheckboxetc.apartados.MyTextFieldPantalla
import com.example.ejerciciobuttoncheckboxetc.ui.theme.EjercicioButtonCheckboxEtcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioButtonCheckboxEtcTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier
            .fillMaxSize()
        .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        MyText()
        MyTextFieldPantalla()
        MyCheckBoxPantalla()
        MyIcon()
        MySwitchPantalla()
        MyImagePantalla()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EjercicioButtonCheckboxEtcTheme {
        Greeting("Android")
    }
}