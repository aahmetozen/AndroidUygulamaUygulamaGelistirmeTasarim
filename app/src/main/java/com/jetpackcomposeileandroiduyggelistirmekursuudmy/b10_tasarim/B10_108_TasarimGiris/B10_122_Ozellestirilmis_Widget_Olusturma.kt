package com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.B10_108_TasarimGiris

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun widgetolusturma(){
    Column(modifier = Modifier.fillMaxSize()) {
        kirmizikutu()
        yesilkutu()
        yazi(icerik = "merhaba", icerikboyutu = 50)
    }
}

@Composable
fun kirmizikutu(){
    Box(modifier = Modifier
        .size(100.dp)
        .background(Color.Red))
}
@Composable
fun yesilkutu(){
    Box(modifier = Modifier
        .size(100.dp)
        .background(Color.Green))
}
@Composable
fun mavikutu(){
    Box(modifier = Modifier
        .size(100.dp)
        .background(Color.Blue))
}
@Composable
fun yazi(icerik:String,icerikboyutu:Int){
    Text(text = icerik, fontSize = icerikboyutu.sp)
}
@Preview
@Composable
fun widgetolusturmapreview(){
    widgetolusturma()
}