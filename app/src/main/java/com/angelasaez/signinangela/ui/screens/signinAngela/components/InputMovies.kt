package com.angelasaez.signinangela.ui.screens.signinAngela.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.angelasaez.signinangela.ui.screens.common.CustomSpacer

// una serie de elementos que se podrán seleccionar
// (6 elementos, FilterChips. elementos = películas).

@Composable
fun InputMovies() {
    val movies = listOf(
        "El Padrino", "Titanic", "Matrix", "Inception",
        "Joker", "Shrek"
    )
    val selectedMovies = remember { mutableStateListOf<String>() }

    Row(
        modifier = Modifier.fillMaxWidth().padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
    ){
        Text(" Selecciona tus películas favoritas;")
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(17.dp,0.dp,17.dp,17.dp)
    ) {
        //3 peliculas
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            movies.subList(0, 3).forEach { movie ->
                val isSelected = movie in selectedMovies

                FilterChip(
                    selected = isSelected,
                    onClick = {
                        if (isSelected) selectedMovies.remove(movie)
                        else selectedMovies.add(movie)
                    },
                    label = { Text(movie) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = Color(0xFF30D03A),
                        selectedLabelColor = Color.White
                    )
                )
            }
        }

        // 3 peliculas
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            movies.subList(3, 6).forEach { movie ->
                val isSelected = movie in selectedMovies

                FilterChip(
                    selected = isSelected,
                    onClick = {
                        if (isSelected) selectedMovies.remove(movie)
                        else selectedMovies.add(movie)
                    },
                    label = { Text(movie) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = Color(0xFF30D03A),
                        selectedLabelColor = Color.White
                    )
                )
            }
        }
    }

    if (selectedMovies.isNotEmpty()) {
        Text(
            text = "Películas seleccionadas: ${selectedMovies.joinToString(", ")}",
            modifier = Modifier.padding(20.dp,0.dp,20.dp,0.dp)
        )
    }

    CustomSpacer(15)
}