package com.angelasaez.registroangela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.angelasaez.registroangela.ui.RegistroAngelaContent
import com.angelasaez.registroangela.ui.screens.registroAngela.RegistroAngela

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RegistroAngelaContent { modifier ->
                RegistroAngela(modifier)
            }
        }
    }
}