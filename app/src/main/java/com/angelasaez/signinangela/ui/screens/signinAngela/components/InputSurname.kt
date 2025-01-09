package com.angelasaez.signinangela.ui.screens.signinAngela.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
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
fun InputSurname() {

    //Checkbox 2 apellidos o uno
    //Se devolverá un String de todas formas
    var checkedSurname by rememberSaveable { mutableStateOf(false) }
    var surname1Value by rememberSaveable { mutableStateOf("") }
    var surname2Value by rememberSaveable { mutableStateOf("") }
    var fullSurname by rememberSaveable { mutableStateOf("") }

    //Letras de la A-Z (mayus y minus), caracteres especiales español.
    val surnameRegex = Regex("^[A-Za-záéíóúÁÉÍÓÚñÑ ]{0,50}$")
    var errorMessage by rememberSaveable { mutableStateOf("") }

    val isFullSurnameValid = errorMessage.isEmpty()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        // Campo para el primer apellido
        Row(
            modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = surname1Value,
                onValueChange = {
                    surname1Value = it
                    errorMessage = if (it.matches(surnameRegex)) {
                        ""
                    } else {
                        "Primer apellido inválido. Solo letras y espacios."
                    }
                    fullSurname = if (checkedSurname && surname2Value.isNotBlank()) {
                        "$surname1Value $surname2Value"
                    } else {
                        surname1Value
                    }
                },
                label = { Text("Introduce tu apellido") },
            )
        }

        // Checkbox segundo apellido
        Row(
            modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(checked = checkedSurname, onCheckedChange = { checkedSurname = it })
            Text(text = "Tengo segundo apellido")
        }

        if (checkedSurname) {
            Row(
                modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = surname2Value,
                    onValueChange = {
                        surname2Value = it
                        errorMessage = if (it.matches(surnameRegex)) {
                            ""
                        } else {
                            "Segundo apellido inválido. Solo letras y espacios."
                        }
                        fullSurname = if (checkedSurname && surname2Value.isNotBlank()) {
                            "$surname1Value $surname2Value"
                        } else {
                            surname1Value
                        }
                    },
                    label = { Text("Introduce tu segundo apellido") },
                )
            }
        }
    }

    if (errorMessage.isNotEmpty()) {
        Text(
            text = errorMessage,
            color = Color.Red,
            modifier = Modifier.padding(start = 15.dp, top = 5.dp)
        )
    }
}