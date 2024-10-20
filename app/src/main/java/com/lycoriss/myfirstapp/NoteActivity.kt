package com.lycoriss.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lycoriss.myfirstapp.ui.theme.MyFirstAppTheme
import com.lycoriss.myfirstapp.MainActivity

class NoteActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstAppTheme {

            }
        }
    }
}

@Composable
fun TopAppBarNote() {
    MyFirstAppTheme {
        Box(contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
        ) {

        }
    }
}

@Composable
fun NoteWindow() {
    MyFirstAppTheme {
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.DarkGray)
                .padding(15.dp)
        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarNotePreview() {
    TopAppBarNote()
}

@Preview(showBackground = true)
@Composable
fun NoteWindowPreview() {
    NoteWindow()
}
