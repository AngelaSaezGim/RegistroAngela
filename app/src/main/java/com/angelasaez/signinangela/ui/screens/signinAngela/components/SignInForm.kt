package com.angelasaez.signinangela.ui.screens.signinAngela.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.angelasaez.signinangela.ui.screens.common.CustomSpacer

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun SignInForm() {

    /*
    Se deben validar los datos para que sigan el formato indicado según la información que almacenan, y cuando se pulse el botón enviar, si todos los datos son correctos aparecerá
    un Alert Dialog con un resumen de los datos introducidos y se borrará el formulario.
     */
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
        CustomSpacer(20)
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
        CustomSpacer(20)

    }
}