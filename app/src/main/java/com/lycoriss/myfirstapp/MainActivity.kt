package com.lycoriss.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lycoriss.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstAppTheme {
                TopAppBar()
            }
        }
    }
}

@Composable
fun TopAppBar() {
    MyFirstAppTheme {
        Box(contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
            ) {
                Button(onClick = {}, shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color(0xFFFFFFFF),
                        containerColor = Color(0xFF000000)
                    ),
                    modifier = Modifier.align(Alignment.TopStart)
                ) {
                    Text(text = "Search")
                }

                Button(onClick = {}, shape = RectangleShape,
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color(0xFFFFFFFF),
                            containerColor = Color(0xFF000000)
                        ),
                        modifier = Modifier.align(Alignment.TopEnd)
                ) {
                    Text(text = "Help")
                }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopAppBar()
}

private fun RowScope.Button(onClick: () -> Unit) {

}
