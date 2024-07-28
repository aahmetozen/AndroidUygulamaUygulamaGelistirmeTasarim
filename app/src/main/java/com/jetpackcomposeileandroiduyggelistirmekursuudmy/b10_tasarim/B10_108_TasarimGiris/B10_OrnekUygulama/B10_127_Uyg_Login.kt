package com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.B10_108_TasarimGiris.B10_OrnekUygulama

import android.util.Log
import android.view.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun loginsayfasi(){
    Surface(color =  MaterialTheme.colorScheme.primary ) {
        val tfkullaniciadi= remember { mutableStateOf("") }
        val tfsifre= remember { mutableStateOf("") }

        Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "logo")
        TextField(value = tfkullaniciadi.value,
            onValueChange = {tfkullaniciadi.value = it},
            label = { Text(text = "kullanici adi:")},
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                disabledTextColor = Color.Black,
                focusedIndicatorColor = Color.Red
            )
            )
            TextField(value = tfsifre.value,
                onValueChange = {tfsifre.value = it},
                label = { Text(text = "sifre:")},
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White,
                    disabledTextColor = Color.Black,
                    focusedIndicatorColor = Color.Red
                )
            )
            Button(onClick = { Log.e("button","giris yapildi") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.White
                ),
                modifier = Modifier.size(250.dp,50.dp)) {
                Text(text = "Giris yap")
                
            }
        }
    }

}
@Preview
@Composable
fun loginsayfasipreview(){
    loginsayfasi()
}