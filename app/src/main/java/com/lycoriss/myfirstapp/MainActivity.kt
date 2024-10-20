package com.lycoriss.myfirstapp

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
                Box() {
                    MainWindow()
                    TopAppBar()
                }
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
                    modifier = Modifier.align(Alignment.TopStart).padding(15.dp)
                ) {
                    Text(text = "Search", fontSize = 25.sp)
                }

                Button(onClick = {}, shape = RectangleShape,
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color(0xFFFFFFFF),
                            containerColor = Color(0xFF000000)
                        ),
                        modifier = Modifier.align(Alignment.TopEnd).padding(15.dp)
                ) {
                    Text(text = "Help", fontSize = 25.sp)
                }
        }
    }
}

@Composable
fun TextEmptyWindow() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(text = "You don't have", fontSize = 30.sp)
        Text(text = "any notes yet", fontSize = 25.sp)
    }
}

@Composable
fun AddNoteButton(modifier: Modifier = Modifier) {
    Button(onClick = {}, shape = RoundedCornerShape(40.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color(0xFFFFFFFF),
            containerColor = Color(0xFF000000)
        ),
        modifier = modifier
    ) {
        Text(text = "+", fontSize = 40.sp, modifier = Modifier.padding(0.dp))
    }
}

@Composable
fun MainWindowElements(modifier: Modifier = Modifier) {
    TextEmptyWindow()
    AddNoteButton(modifier = modifier)
}

@Composable
fun MainWindow() {
    MyFirstAppTheme {
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.LightGray)
                                .padding(15.dp)
        ) {
            MainWindowElements(modifier = Modifier
                                .align(Alignment.BottomEnd)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopAppBar()
}

@Preview(showBackground = true)
@Composable
fun TextEmptyWindowPreview() {
    TextEmptyWindow()
}

@Preview(showBackground = true)
@Composable
fun AddNoteButtonPreview() {
    AddNoteButton()
}

@Preview(showBackground = true)
@Composable
fun MainWindowPreview() {
    MainWindow()
}

private fun RowScope.Button(onClick: () -> Unit) {

}
