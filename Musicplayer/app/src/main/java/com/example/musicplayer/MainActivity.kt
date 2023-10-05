package com.example.musicplayer

import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicplayer.ui.theme.MusicplayerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

             playAudio(this)
            }
        }
    }
@SuppressLint("ComposableNaming")
@Composable
fun playAudio(context: Context){

    val mp: MediaPlayer = MediaPlayer.create(context,R.raw.music)


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

     Image(painter = painterResource(id = R.drawable.ic_music),
         contentDescription = "",
         modifier = Modifier
             .height(160.dp)
             .width(16.dp)
             .padding(32.dp)
             .background(Color.Blue)
     )
        Row {

            IconButton(onClick = { mp.start() }, modifier =Modifier.size(35.dp)) {
                Icon(painter = painterResource(id = R.drawable.ic_play), contentDescription = "")
                
            }

            IconButton(onClick = { mp.start() }, modifier =Modifier.size(35.dp)) {
                Icon(painter = painterResource(id = R.drawable.ic_pause), contentDescription = "")

            }

            
        }

    }
}