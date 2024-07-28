package com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.B10_108_TasarimGiris.B10_114_Hizalama

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
// Column icin verticalArrangement kullanirken
// Row icin horizontalArrangement kullanilir
@Composable
fun arragmentkullanimi(){
    Column(verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxHeight()) {
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Blue))
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Green))
    }
    Row(horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth()) {
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Blue))
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Green))
    }
}

@Preview
@Composable
fun arragmentkullanimipreview(){
    arragmentkullanimi()
}