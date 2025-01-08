package com.angelasaez.signinangela.ui.screens.signinAngela.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InputSurname() {

    //Checkbox 2 apellidos o uno (Si es uno = Introducir un apellido)
    //(Si son dos = introducir dos apellidos)
    //Se devolverá un String de todas formasa

    var fullSurnameValue by rememberSaveable { mutableStateOf("") }
    var surname1Value by rememberSaveable { mutableStateOf("") }
    var surname2Value by rememberSaveable { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        OutlinedTextField(
            value = surname1Value,
            onValueChange = { surname1Value = it},
            label = { Text(" Introduce tu apellido")}
        )
    }

}