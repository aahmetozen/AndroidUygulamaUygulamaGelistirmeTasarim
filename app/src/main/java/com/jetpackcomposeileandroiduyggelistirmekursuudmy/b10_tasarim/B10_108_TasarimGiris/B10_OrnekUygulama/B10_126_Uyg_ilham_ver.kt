package com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.B10_108_TasarimGiris.B10_OrnekUygulama


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.b10_tasarim.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ilhamver() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "ilham ver") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.anarenk),
                    titleContentColor = colorResource(id = R.color.white)
                )
            )
        },
        bottomBar = {
            BottomAppBar {
                Text(text = "Steve Jobs - ilham ver")
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "add")
            }
        },

    ){ paddingValues ->
        Column(modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
            , verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Column(modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally){
                Image(painter = painterResource(id = R.drawable.stevejobs),
                    contentDescription = "sj")
                Text(
                    text = "Steve Jobs",
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )

            }
            Text(modifier = Modifier.padding(all = 10.dp),
                textAlign = TextAlign.Center,
                text = "Dunyayi degistirecek insanlar onu degistirebilecegini dusenecek kadar cilgin olanlardir.")

            Button(colors =ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.White
            ) , onClick = { /*TODO*/ }) {
                Text(text = "ilham ver")
                
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ilhamverpreview() {
    ilhamver()
}

