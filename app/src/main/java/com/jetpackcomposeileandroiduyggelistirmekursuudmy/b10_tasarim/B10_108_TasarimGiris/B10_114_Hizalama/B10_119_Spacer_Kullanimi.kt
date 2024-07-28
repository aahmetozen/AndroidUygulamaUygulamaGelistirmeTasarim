package com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.B10_108_TasarimGiris.B10_114_Hizalama

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun spacerkullanimi(){
    Row {
        Box(modifier = Modifier
            .size(100.dp) // 100 x 100
            .background(Color.Red))
        Spacer(modifier = Modifier.size(100.dp))
        Box(modifier = Modifier
            .size(80.dp, 200.dp) // 80 x 200
            .background(Color.Green))
    }
}
@Preview
@Composable
fun spacerkullanimipreview(){
    spacerkullanimi()
}