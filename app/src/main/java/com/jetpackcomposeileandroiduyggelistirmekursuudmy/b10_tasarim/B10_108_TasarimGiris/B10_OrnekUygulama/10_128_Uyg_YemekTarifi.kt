package com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.B10_108_TasarimGiris.B10_OrnekUygulama

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun yemektarifi(){
    Scaffold(topBar = {
        TopAppBar(
            title = { yazi(icerik = "Yemek Tarifi")},
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = colorResource(id = R.color.anaRyemek)
            ))
    }) {paddingValues ->
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()) {
            Image(painter = painterResource(id = R.drawable.yemekresim), contentDescription = "yemek resim")
            Row(modifier = Modifier.fillMaxWidth()) {
                Button(colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.anaRyemek)),
                    modifier = Modifier.weight(50f), onClick = { }) {
                    yazi(icerik = "Begen")
                }
                Button(colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.anaRyemekalternatif)),
                    modifier = Modifier.weight(50f), onClick = { }) {
                    yazi(icerik = "Yorum yap")
                }
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(all = 10.dp)) {
                Text(text = "Kofte",
                    color = colorResource(id = R.color.anaRyemekalternatif),
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold)
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    yazi(icerik = "izgaraya uygun")
                    yazi(icerik = "7 Haziran")
                }
            }
            Spacer(modifier = Modifier.size(25.dp))
            Text(text = "Kofte harcini hazirlamak icin, soganlari rendeleyin ve maydanozlari ince ince kiyin. isterseniz, bir dis sarimsakda ekleyebilirsiniz. ",
                modifier = Modifier.padding(all = 10.dp),
                textAlign = TextAlign.Center,
                fontSize = 16.sp)
        }
    }
}
@Composable
fun yazi(icerik:String){
    Text(text = icerik)
}

@Preview
@Composable
fun yemektarifipreview(){
    yemektarifi()
}