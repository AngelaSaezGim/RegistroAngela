package com.angelasaez.signinangela.ui.screens.signinAngela.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.util.Calendar
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.ui.graphics.Color
import com.angelasaez.signinangela.ui.screens.common.CustomSpacer
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputBirth() {

    var dateBirthValue by rememberSaveable { mutableStateOf("") }
    val datePickerState = rememberDatePickerState(initialSelectedDateMillis = Calendar.getInstance().timeInMillis)
    var formattedDate by rememberSaveable { mutableStateOf("No seleccionada") }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp,0.dp,15.dp,0.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(" Selecciona tu fecha de nacimiento")
    }
    //ROW DE CALENDARIO
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp, 20.dp, 20.dp,0.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.elevatedCardElevation(4.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent) // Fondo transparente

        ) {
            DatePicker(
                state = datePickerState,
                modifier = Modifier.fillMaxWidth()
                                    .padding(20.dp, 20.dp, 20.dp,0.dp)
            )
        }
        formattedDate = datePickerState.selectedDateMillis?.let { millis ->
            val instant = Instant.ofEpochMilli(millis)
            val formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault())
            formatter.format(instant)
        } ?: "No seleccionada"
    }
    //FIN ROW DE CALENDARIO
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 20.dp, 20.dp,0.dp),
        verticalAlignment = Alignment.CenterVertically,
    ){
        Text(
            text = "Fecha seleccionada: $formattedDate", //$formattedDate
        )
    }
    CustomSpacer(15)
}