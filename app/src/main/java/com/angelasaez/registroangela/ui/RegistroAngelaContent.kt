package com.angelasaez.registroangela.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.angelasaez.registroangela.ui.theme.RegistroAngelaTheme

@Composable
fun RegistroAngelaContent(content: @Composable (modifier: Modifier) -> Unit) {

    RegistroAngelaTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            content(Modifier.padding(innerPadding))
        }
    }
}