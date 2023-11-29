package com.example.bookshelf.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.bookshelf.ui.theme.BookShelfTheme
import com.example.bookshelf.R


@Composable
fun HomeScreen(
    bookUiState: String,modifier: Modifier = Modifier
){

    ResultScreen(bookUiState,modifier)
}

@Composable
fun ResultScreen(photos: String,modifier: Modifier = Modifier){
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ){
       Text(text = photos) 
    }

}

@Preview
@Composable
fun ResultScreenPreview(){
    BookShelfTheme {
        ResultScreen(stringResource(R.string.placeholder_result))
    }
}