package com.angelasaez.signinangela.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.angelasaez.signinangela.ui.theme.SignInAngelaTheme

@Composable
fun SignInAngelaContent(content: @Composable (modifier: Modifier) -> Unit) {

    SignInAngelaTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            content(Modifier.padding(innerPadding))
        }
    }
}