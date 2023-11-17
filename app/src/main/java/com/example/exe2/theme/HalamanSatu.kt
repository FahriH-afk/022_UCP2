package com.example.exe2.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.exe2.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
) {
    var namaMahasiswa by rememberSaveable { mutableStateOf(value = "") }
    var NIM by rememberSaveable { mutableStateOf(value = "") }
    var Konsentrasi by rememberSaveable { mutableStateOf(value = "") }
    var judulSkripsi by rememberSaveable { mutableStateOf(value = "") }
    var listdata: MutableList<String> = mutableListOf(namaMahasiswa, NIM, Konsentrasi, judulSkripsi)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        OutlinedTextField(
            value = namaMahasiswa,
            onValueChange = { namaMahasiswa = it },
            label = { Text(text = "Nama Mahasiswa") })

        OutlinedTextField(
            value = NIM,
            onValueChange = { NIM = it },
            label = { Text(text = "NIM") })

        OutlinedTextField(
            value = Konsentrasi,
            onValueChange = { Konsentrasi = it },
            label = { Text(text = "Konsentrasi") })

        OutlinedTextField(
            value = judulSkripsi,
            onValueChange = { judulSkripsi = it },
            label = { Text(text = "Judul Skripsi") })

        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = { onSubmitButtonClicked(listdata) }) {
            Text(text = stringResource(id = R.string.btn_Submit))
        }
    }
}