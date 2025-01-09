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
fun InputEmail() {

    var emailValue by rememberSaveable { mutableStateOf("") }
    val emailRegex = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\$")
    var errorMessage by rememberSaveable { mutableStateOf("") }
    val isEmailValid = errorMessage.isEmpty()

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        OutlinedTextField(value = emailValue, onValueChange = {
            emailValue = it
            errorMessage = if (it.matches(emailRegex)) {
                ""
            } else {
                "Email inválido. Ingresa un email válido."
            }
        }, label = { Text(" Introduce tu email") }, isError = errorMessage.isNotEmpty()
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