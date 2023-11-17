package com.example.exe2.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.exe2.Data.FormUIState
import com.example.exe2.R

@Composable
fun HalamanDua (
    formUIState: FormUIState,
    onBackButtonClicked: () -> Unit
) {
    Column (
        verticalArrangement = Arrangement.Center,

        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

    ) {
        Text(text = "Nama Mahasiswa")
        Text(text = formUIState.namaMahasiswa)
        Divider()
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "NIM")
        Text(text = formUIState.NIM)
        Divider()
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "Konsentrasi")
        Text(text = formUIState.Konsentrasi)
        Divider()
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "Judul Skripsi")
        Text(text = formUIState.judulSkripsi)
        Spacer(modifier = Modifier.padding(8.dp))

        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { onBackButtonClicked() }) {
                Text(text = stringResource(id = R.string.btn_back))
            }
        }
    }
}