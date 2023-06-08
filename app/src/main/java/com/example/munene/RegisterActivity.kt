package com.example.munene

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContent()
                 {
                    Greeting()
                }
            }
        }



@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.teal),
            contentDescription = null, // Provide a description if needed
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        // Add other composables or UI elements here
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        var name by remember { mutableStateOf(TextFieldValue("")) }
        var number by remember { mutableStateOf(TextFieldValue("")) }
        var email by remember { mutableStateOf(TextFieldValue("")) }
        var pass by remember { mutableStateOf(TextFieldValue("")) }
        var conpass by remember { mutableStateOf(TextFieldValue("")) }

       Text("CREATE ACCOUNT", color = Color.White)


        Image(painter = painterResource(id = R.drawable.icontbg), contentDescription = "abcd",
            modifier = Modifier
                .size(100.dp)
        )

        OutlinedTextField(
            value = name,
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "emailIcon") },
            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                name = it
            },
            label = { Text(text = "Name") },
            placeholder = { Text(text = "Enter your Name") },
            colors = TextFieldDefaults.textFieldColors(placeholderColor= Color.White,
                disabledPlaceholderColor = Color.DarkGray
            ),
        )
        Spacer(modifier = Modifier
            .height(15.dp))

        OutlinedTextField(
            value = number,
            leadingIcon = { Icon(imageVector = Icons.Default.Star, contentDescription = "emailIcon") },
            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                number= it
            },
            label = { Text(text = "Phone Number") },
            placeholder = { Text(text = "Enter your Phone number") },
            colors = TextFieldDefaults.textFieldColors(placeholderColor= Color.White,
                disabledPlaceholderColor = Color.DarkGray
            ),
        )
        Spacer(modifier = Modifier
            .height(15.dp))

        OutlinedTextField(
            value = pass,
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "emailIcon") },
            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                pass = it
            },
            label = { Text(text = "Password") },
            placeholder = { Text(text = "Enter your password") },
            colors = TextFieldDefaults.textFieldColors(placeholderColor= Color.White,
                disabledPlaceholderColor = Color.DarkGray
            ),
        )
            Spacer(modifier = Modifier
                .height(15.dp))


        OutlinedTextField(
            value = conpass,
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "emailIcon") },
            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                conpass = it
            },

            label = { Text(text = "Confirm Password") },
            placeholder = { Text(text = "confrirm the entered password") },
            colors = TextFieldDefaults.textFieldColors(placeholderColor= Color.White,
                disabledPlaceholderColor = Color.DarkGray
            ),

        )

        Spacer(modifier = Modifier
            .height(15.dp))


        Button(onClick = {
            //your onclick code here
        },elevation =  ButtonDefaults.buttonElevation(
            defaultElevation = 10.dp,
            pressedElevation = 15.dp,
            disabledElevation = 0.dp
        )) {
            Text(text = "Register")
    }
















    }}


