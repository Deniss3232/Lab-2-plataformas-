package com.example.lab2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab2.ui.theme.Lab2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab2Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    GreetingScreen()
                }
            }
        }
    }

    @Composable
    fun GreetingScreen() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Bienvenido a la App", fontSize = 24.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "¡Hola! Soy Denis, esta es mi app del Lab 2.", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = {
                Toast.makeText(applicationContext, "¡Hola desde Jetpack Compose!", Toast.LENGTH_SHORT).show()
            }) {
                Text("Mostrar Mensaje")
            }
        }
    }
}