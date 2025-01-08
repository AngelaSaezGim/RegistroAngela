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
fun SendButton() {

    Button(
        onClick = { },
        modifier = Modifier
            .padding(top = 6.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.teal_700),
            contentColor = Color.White
        )
    ) {
        Text("Enviar")
        CustomSpacer(width = 10)
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "send",
            modifier = Modifier.size(20.dp)
        )
    }


}