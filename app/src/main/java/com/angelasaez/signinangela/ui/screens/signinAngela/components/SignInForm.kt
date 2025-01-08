package com.angelasaez.signinangela.ui.screens.signinAngela.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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
        InputName()

        // el email
        InputName()

        // el número de teléfono
        InputName()

        // la fecha de nacimiento
        InputName()

        // una serie de elementos que se podrán seleccionar
        // (6 elementos, FilterChips. elementos = películas).
        InputName()

        //dos botones, uno para borrar todos los campos y otro para enviar el formulario.
        InputName()

        InputName()

        InputName()

    }
}