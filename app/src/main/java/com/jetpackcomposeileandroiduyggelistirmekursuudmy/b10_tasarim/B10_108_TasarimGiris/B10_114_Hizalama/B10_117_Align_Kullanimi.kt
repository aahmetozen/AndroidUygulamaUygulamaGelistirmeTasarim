package com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.B10_108_TasarimGiris.B10_114_Hizalama

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun alignkullanimi(){
    Box(modifier = Modifier
        .size(200.dp)
        .background(Color.Red)){
        Text(modifier = Modifier.align(Alignment.TopEnd), text = "Merhaba")
    }
}
@Preview
@Composable
fun alignkullanimipreview(){
    alignkullanimi()
}