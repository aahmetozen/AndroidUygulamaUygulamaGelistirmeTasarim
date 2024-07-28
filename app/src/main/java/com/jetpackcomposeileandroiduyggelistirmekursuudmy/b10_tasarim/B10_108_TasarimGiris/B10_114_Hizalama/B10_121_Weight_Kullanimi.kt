package com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.B10_108_TasarimGiris.B10_114_Hizalama

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
// weight: nesneyi yatayda yayarak bosluk alanlari kullanabiliriz.
@Composable
fun weightkullanimi(){
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(modifier = Modifier.size(100.dp)
            .background(Color.Red)
            .weight(50f))
        Box(modifier = Modifier.size(100.dp)
            .background(Color.Green)
            .weight(20f))
        Box(modifier = Modifier.size(100.dp)
            .background(Color.Blue)
            .weight(30f))
    }
}
@Preview
@Composable
fun weightkullanimipreview(){
    weightkullanimi()
}