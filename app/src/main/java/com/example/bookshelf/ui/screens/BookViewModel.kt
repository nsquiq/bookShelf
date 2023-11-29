package com.example.bookshelf.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BookViewModel : ViewModel() {

    var bookUiState: String by mutableStateOf("")
        private set


    init {
        getBookPhotos()
    }


    fun getBookPhotos() {
        bookUiState = "Set the Mars API status response here!"
    }
}