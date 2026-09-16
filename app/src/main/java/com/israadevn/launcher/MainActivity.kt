package com.israadevn.launcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                var username by remember { mutableStateOf("") }
                var launched by remember { mutableStateOf(false) }
                
                Column(
                    modifier = Modifier.fillMaxSize().padding(24.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Aldi Launcher", fontSize = 28.sp)
                    Text("Zalith x Nux Edition", fontSize = 14.sp)
                    Spacer(Modifier.height(24.dp))
                    OutlinedTextField(
                        value = username,
                        onValueChange = { username = it },
                        label = { Text("Username Offline") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(Modifier.height(16.dp))
                    Button(
                        onClick = { launched = true },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("LAUNCH MINECRAFT 1.21.9")
                    }
                    if (launched) {
                        Spacer(Modifier.height(16.dp))
                        Text("Welcome, $username! Ready to play.", color = MaterialTheme.colorScheme.primary)
                    }
                }
            }
        }
    }
}
