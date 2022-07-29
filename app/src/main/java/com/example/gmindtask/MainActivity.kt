package com.example.gmindtask

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.gmindtask.ui.theme.GMindTaskTheme
import com.unity3d.player.UnityPlayerActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GMindTaskTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Scaffold (
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(text = "GMind Task")
                                }
                            )
                        }
                            ){
                        Box(modifier = Modifier.fillMaxSize())
                        {
                            Button(
                                modifier = Modifier.align(Alignment.Center),
                                onClick = {
                                    val intent = Intent(this@MainActivity,UnityPlayerActivity::class.java)
                                    intent.putExtra("unity","GMind Task")
                                    startActivity(intent)
                                }) {
                                Text(text = "My Unity Game")
                            }
                        }
                    }
                }
            }
        }
    }
}

