package com.metehanbolat.webviewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.webviewcompose.ui.MainScreen
import com.metehanbolat.webviewcompose.ui.theme.WebViewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WebViewComposeTheme {
                MainScreen()
            }
        }
    }
}