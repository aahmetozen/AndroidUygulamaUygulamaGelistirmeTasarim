package com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.B10_108_TasarimGiris.B10_109_Row_Column_Box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun karisikkullanim(){
    Box{
        Box(modifier = Modifier
            .size(400.dp)
            .background(Color.Black))
        Column {
            Box(modifier = Modifier
                .size(100.dp)
                .background(Color.Blue))
            Box(modifier = Modifier
                .size(100.dp)
                .background(Color.Red))
            Row {
                Box(modifier = Modifier
                    .size(100.dp)
                    .background(Color.Green))
                Box(modifier = Modifier
                    .size(100.dp)
                    .background(Color.Yellow))
            }
        }
    }
}
@Preview
@Composable
fun karisikkullanimpreview(){
    karisikkullanim()
}