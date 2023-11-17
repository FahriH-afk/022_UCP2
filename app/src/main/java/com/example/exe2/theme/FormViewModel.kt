package com.example.exe2.theme

import androidx.lifecycle.ViewModel
import com.example.exe2.Data.FormUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FormViewModel : ViewModel () {
    private val _stateUI = MutableStateFlow(FormUIState())
    val stateUI: StateFlow<FormUIState> = _stateUI.asStateFlow()

    fun setForm (listform: MutableList<String>) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                namaMahasiswa = listform[0],
                NIM = listform [1],
                Konsentrasi = listform [2],
                judulSkripsi = listform [3]
            )
        }
    }
}