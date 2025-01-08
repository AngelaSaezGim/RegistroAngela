package com.angelasaez.signinangela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.angelasaez.signinangela.ui.SignInAngelaContent
import com.angelasaez.signinangela.ui.screens.signinAngela.SignInAngela

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SignInAngelaContent { modifier ->
                SignInAngela(modifier)
            }
        }
    }
}