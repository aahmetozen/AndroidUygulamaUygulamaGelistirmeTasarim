package com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.B10_108_TasarimGiris.B10_114_Hizalama

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun paddingkullanimi(){
    Row {
        Text(text = "Merhaba", modifier = Modifier.padding(start = 5.dp, end = 10.dp, top = 20.dp, bottom = 30.dp))
        Box(modifier = Modifier
            .size(100.dp) // 100 x 100
            .background(Color.Red))
        Box(modifier = Modifier
            .size(80.dp, 200.dp) // 80 x 200
            .background(Color.Green)
            )
    }
}
@Preview
@Composable
fun paddingkullanimipreview(){
    paddingkullanimi()
}