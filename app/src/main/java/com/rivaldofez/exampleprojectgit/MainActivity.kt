package com.rivaldofez.exampleprojectgit

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
import com.rivaldofez.exampleprojectgit.ui.theme.ExampleProjectGitTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExampleProjectGitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val random = Random.nextInt(0, 100)
                    if(random > 50)  {
                        Salam(
                            name = "Hello World!",
                            modifier = Modifier.padding(innerPadding)
                        )
                    } else {
                        Salam(
                            name = "Hello World+",
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Salam(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExampleProjectGitTheme {
        Salam("Android")
    }
}