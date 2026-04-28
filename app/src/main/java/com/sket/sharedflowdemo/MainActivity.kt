package com.sket.sharedflowdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sket.sharedflowdemo.ui.theme.SharedFlowDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SharedFlowDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    StartScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun StartScreen(
    modifier: Modifier = Modifier, viewModel: DemoViewModel = viewModel()
) {
    Text(
        text = "Hello !", modifier = modifier
    )
}
