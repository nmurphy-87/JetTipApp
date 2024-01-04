package com.niallmurph.jettipapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.niallmurph.jettipapp.ui.theme.JetTipAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                Text("Hello Again")
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {

    JetTipAppTheme {
        Surface(
            color = MaterialTheme.colors.background
        ) {
            content()
        }
    }

}

@Preview
@Composable
fun TopHeader() {
    Surface(modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clip(shape = RoundedCornerShape(corner = CornerSize(12.dp))),
        color = Color(0xFFE9D7f7)
    ) {
        Column() {

        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetTipAppTheme {
        Surface(
            color = MaterialTheme.colors.background
        ) {
            Text("Hello Again")
        }
    }
}