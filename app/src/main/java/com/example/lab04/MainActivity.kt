package com.example.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lab04.ui.theme.Lab04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainContent(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        ViewCard()
        Spacer(modifier = Modifier.height(16.dp))
        ViewButton()
        Spacer(modifier = Modifier.height(16.dp))
        ViewSwitch()
    }
}

@Composable
fun ViewCard() {
    Card {
        Text(text = "Componente Card", modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun ViewButton() {
    FloatingActionButton(onClick = {}) {
        Text(text = "FAB")
    }
}


@Composable
fun ViewSwitch() {
    Switch(checked = true, onCheckedChange = {})
    
}