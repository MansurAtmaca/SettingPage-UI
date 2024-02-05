package com.example.settingui

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomButton(text:String,id:Int){
    Button(
        onClick = { /*TODO*/ },
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 36.dp, vertical = 8.dp)
            .height(55.dp)
            .border(
                width = 2.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(20)
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(20)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Image(painter = painterResource(id = id), contentDescription = null)
            Column(
                Modifier
                    .fillMaxHeight(), verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = text,
                    modifier = Modifier.padding(start = 16.dp),
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }

    }
}