package com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.B10_108_TasarimGiris.B10_109_Row_Column_Box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun boxkullanimi(){
    Box(modifier = Modifier
        .size(80.dp)
        .background(Color.Red))
    Box(modifier = Modifier
        .size(50.dp)
        .background(Color.Green))
    Box(modifier = Modifier
        .size(30.dp)
        .background(Color.Blue))
    Text(text = "Merhaba")


}
@Preview
@Composable
fun boxkullanimipreview(){
    boxkullanimi()
}
