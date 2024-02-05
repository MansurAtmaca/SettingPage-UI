package com.example.settingui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.settingui.ui.theme.SettingUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SettingUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    settingScreen()
                }
            }
        }
    }
}

@Composable
fun settingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ConstraintLayout {
            val (top_back, profile) = createRefs()
            Image(
                painter = painterResource(id = R.drawable.top_background),
                contentDescription = null,
                Modifier
                    .constrainAs(top_back) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                Modifier
                    .constrainAs(profile) {
                        top.linkTo(top_back.bottom)
                        bottom.linkTo(top_back.bottom)
                        start.linkTo(top_back.start)
                        end.linkTo(top_back.end)
                    })
        }
        Text(text = "Mansurcan Atmaca", fontSize = 24.sp)
        Text(text = "Android Developer",Modifier.padding(bottom = 16.dp), fontSize = 16.sp, color = Color.Gray)
        CustomButton(text = "Personel Information", id = R.drawable.ic_3)
        CustomButton(text = "Settings", id = R.drawable.ic_1)
        CustomButton(text = "Articles", id = R.drawable.ic_2)
        CustomButton(text = "Notification", id = R.drawable.ic_4)
        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 36.dp, vertical = 32.dp)
            .height(55.dp),
            colors = ButtonDefaults.buttonColors(
               containerColor = Color(android.graphics.Color.parseColor("#373ebf"))
            ),
            onClick = { /*TODO*/ }) {
            Text(text = "Back to Main Page")
            
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PrevSetting() {
    settingScreen()
}