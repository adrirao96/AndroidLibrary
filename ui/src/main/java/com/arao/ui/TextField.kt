package com.arao.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ArTextField() {
    OutlinedTextField(
        value = "Prueba",
        onValueChange = {}
    )
}