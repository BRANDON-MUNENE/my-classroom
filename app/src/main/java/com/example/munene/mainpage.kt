package net.jetpackcompose.composetext.activities

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.munene.Greeting
import com.example.munene.R


class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent()
        {
            Greeting()
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview()
@Composable
fun Greeting() {//fungreeting
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){//maincolumnsquare


        Scaffold(//scaffold
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = "MY CLASSROOM")
                    },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.List, "backIcon")
                        }
                    },
                )
            },

            content = {//content
                Box(modifier = Modifier) {
                    Image(
                        painter = painterResource(R.drawable.kinder2),
                        contentDescription = null, // Provide a description if needed
                        modifier = Modifier
                    )
                }


                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.LightGray),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {//othercolumnsquare

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.kinder2),
                        contentDescription = "about",
                        modifier = Modifier
                            .size(300.dp)
                    )

                }

                    Spacer(modifier = Modifier
                        .height(20.dp))


                    LazyColumn {//mainlazycolumn

                        item {Column (horizontalAlignment = Alignment.CenterHorizontally){
                            Text(text = "ABOUT", color = Color.Black)

                            LazyRow {
                                item {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.exams),
                                            contentDescription = "abcd",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)
                                        )
                                        Text(text = "KNOW YOUR GRADES", color = Color.Black)
                                    }
                                }
                            }
                            LazyRow {
                                item {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.assign),
                                            contentDescription = "abcd",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)
                                        )
                                        Text(text = "KNOW ASSIGNMENTS")
                                    }
                                }
                            }
                            LazyRow{
                                item {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ){
                                        Image(painter = painterResource(id = R.drawable.eve),
                                            contentDescription = "abcd",
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .size(100.dp)
                                                .padding(5.dp)

                                        )
                                        Text(text = "KNOW UPCOMING EVENTS")
                                    }
                                }
                            }



                        }
                    }


//                    the page contents are placed here


                }//mainlazycolumn














                }//othercolumnsquare
            }//content
        )//scaffold
    }//maincolumnsquare
}//fungreeting







































































