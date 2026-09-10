package com.example.praktikum2_245150207111020_affanabyarahman

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.praktikum2_245150207111020_affanabyarahman.ui.theme.Praktikum2_245150207111020_AffanAbyarahmanTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum2_245150207111020_AffanAbyarahmanTheme {
                ProfileScreen()
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
//            .size(
//                height = 1200.dp,
//                width = 450.dp
//            )
            .fillMaxSize()
            .padding(4.dp)
            .background(Color.hsv(
                hue = 220f,
                saturation = 0.25f,
                value = 0.95f
            ))
    ) {

//        Spacer(modifier = Modifier
//            .padding(128.dp)
//        )

        Image(
            painter = painterResource(id = R.drawable.profil),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Affan Abyarahman",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace
        )

        Text("245150207111020")

        Text(
            text = "Teknik Informatika",
//            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.height(8.dp))

        FollowButton()
    }
}

@Composable
fun FollowButton() {
    var isFollowed by remember { mutableStateOf(false) }

    Button(
        onClick = {
            isFollowed = !isFollowed
        }
    ) {
        Text(if (isFollowed) "Unfollow" else "Follow")
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    Praktikum2_245150207111020_AffanAbyarahmanTheme {
        ProfileScreen()
    }
}