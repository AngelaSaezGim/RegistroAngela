package com.angelasaez.signinangela.ui.screens.signinAngela

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelasaez.signinangela.ui.screens.common.AuthorInfo
import com.angelasaez.signinangela.ui.screens.common.CustomSpacer
import com.angelasaez.signinangela.ui.screens.signinAngela.components.SignInForm

@Composable
fun SignInAngela(modifier: Modifier) {

    //Columna principal applicación
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFF5EEF8),
                        Color(0xFF30D03A),
                    )
                )
            )
            .then(modifier),
        verticalArrangement = Arrangement.Top,
    ) {
        Row(
            modifier = Modifier
                .padding(15.dp)
                .shadow(2.dp, RectangleShape, true, Color.Black)
                .padding(15.dp),
        ) {
            Text(
                text = "Formulario de Registro", fontSize = 20.sp
            )
        }

        SignInForm()

        AuthorInfo()
    }
}