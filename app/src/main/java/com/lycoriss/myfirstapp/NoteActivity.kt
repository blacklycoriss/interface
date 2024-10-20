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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun ExitButton(modifier: Modifier = Modifier) {
    Button(onClick = {}, shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(
            contentColor = Color(0xFFFFFFFF),
            containerColor = Color(0xFF000000)
        ),
        modifier = modifier
    ) {
        Text(text = "Exit", fontSize = 25.sp)
    }
}

@Composable
fun CreateButton(modifier: Modifier = Modifier) {
    Button(onClick = {}, shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(
            contentColor = Color(0xFFFFFFFF),
            containerColor = Color(0xFF000000)
        ),
        modifier = modifier
    ) {
        Text(text = "Create", fontSize = 25.sp)
    }
}

@Composable
fun EditNoteField(value: String, onValueChange: () -> Unit) {
    TextField(value = value,
        textStyle = TextStyle(fontSize=25.sp),
        onValueChange = {onValueChange()},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        placeholder = { Text("Enter your note here") },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color(0xffeeeeee),
            unfocusedTextColor = Color(0xff888888),
            focusedContainerColor = Color.White,
            focusedTextColor = Color(0xff222222),
        )
    )
}

@Composable
fun TopAppBarNote() {
    MyFirstAppTheme {
        Box(contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
        ) {
            ExitButton(modifier = Modifier
                                            .align(Alignment.TopStart)
                                            .padding(15.dp)
            )
            CreateButton(modifier = Modifier
                                            .align(Alignment.TopEnd)
                                            .padding(15.dp)
            )
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
fun ExitButtonPreview() {
    ExitButton()
}

@Preview(showBackground = true)
@Composable
fun CreateButtonPreview() {
    CreateButton()
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
