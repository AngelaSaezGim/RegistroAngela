package com.angelasaez.signinangela.ui.screens.signinAngela.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun ResetButton() {

    Button(
        onClick = { },
        modifier = Modifier
            .size(110.dp,40.dp)
            .padding(top = 6.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.teal_700),
            contentColor = Color.White
        )
    ) {
        Text("Borrar")
        CustomSpacer(width = 10)
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "delete",
            modifier = Modifier.size(20.dp)
        )
    }

}