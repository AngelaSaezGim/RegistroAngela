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
fun InputPhone() {

    var phoneValue by rememberSaveable { mutableStateOf("") }
    val phoneRegex = Regex("^\\d{9}$")  // Validación para 9 dígitos numéricos
    var errorMessage by rememberSaveable { mutableStateOf("") }

    val isPhoneValid = errorMessage.isEmpty()

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        OutlinedTextField(
            value = phoneValue,
            onValueChange = { phoneValue = it
                errorMessage = if (it.matches(phoneRegex)) {
                    ""
                } else {
                    "Teléfono inválido. Debe contener 9 dígitos."
                }},
            label = { Text(" Introduce tu teléfono") },
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
    CustomSpacer(20)
}