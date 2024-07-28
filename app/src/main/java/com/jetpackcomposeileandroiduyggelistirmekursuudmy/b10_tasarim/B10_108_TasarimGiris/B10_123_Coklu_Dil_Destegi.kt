package com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.B10_108_TasarimGiris

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.R

/* Olusturacagimiz uygulamalar uluslar arasi olabilir ve bircok ulke icin
*  dil destegi sunmaliyiz
*  Coklu dil destegi saglamak icin String dosyasinin farkli diller icin olan
*  turleri olsuturmaliyiz.
*  Genelde varsayilan dil ingilizcedir */

// kullanacagimiz stringleri res/values/string.xml den cekmemiz lazim
@Composable
fun CDD(){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = stringResource(id = R.string.textYazi), fontSize = 50.sp)
        Button(onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = R.string.buttonYazi), fontSize = 24.sp)
            
        }
    }
}
@Preview(locale ="tr" )
@Composable
fun CDDpreview(){
    CDD()
}