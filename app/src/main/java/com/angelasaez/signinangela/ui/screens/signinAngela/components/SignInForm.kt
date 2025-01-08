package com.angelasaez.signinangela.ui.screens.signinAngela.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.angelasaez.signinangela.R
import com.angelasaez.signinangela.ui.screens.common.CustomSpacer

@Composable
fun SignInForm() {

    //Scroll solo en el formulario
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .border(2.dp, Color.Black)
            .height(590.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Center,
    ){
        //nombre
        InputName()

        // los apellidos - 2 (pero si dejas vacio no te da error)
        InputSurname()

        // el email
        InputEmail()

        // el número de teléfono
        InputPhone()

        // la fecha de nacimiento
        InputBirth()

        // una serie de elementos que se podrán seleccionar
        // (6 elementos, FilterChips. elementos = películas).
        InputMovies()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ){
        //dos botones, uno para borrar todos los campos y otro para enviar el formulario.

            SendButton()
            CustomSpacer(width = 15)
            ResetButton()

        }

    }
}