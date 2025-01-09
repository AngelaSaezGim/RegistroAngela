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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.angelasaez.signinangela.ui.screens.common.CustomSpacer

@Composable
fun InputName() {

    var nameValue by rememberSaveable { mutableStateOf("") }
    //Letras de la A-Z (mayus y minus), caracteres especiales español, espacios y tamaño de 2 a 50
    val nameRegex = Regex("^[A-Za-záéíóúÁÉÍÓÚñÑ ]{0,50}$")
    var errorMessage by rememberSaveable { mutableStateOf("") }

    val isNameValid = errorMessage.isEmpty()

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        OutlinedTextField(
            value = nameValue,
            onValueChange = {
                nameValue = it
                errorMessage = if (it.matches(nameRegex)) {
                    ""
                } else {
                    "Nombre inválido. Solo letras y espacios."
                }
            },
            label = { Text(" Introduce tu nombre")
            },
            isError = errorMessage.isNotEmpty()
        )
    }

    if (errorMessage.isNotEmpty()) {
        Text(
            text = errorMessage,
            color = Color.Red,
            modifier = Modifier.padding(start = 15.dp, top = 5.dp)
        )
    }

    CustomSpacer(15)

}