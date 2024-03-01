package com.training.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.training.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                ArtSpaceScreen()
            }
        }
    }
}

@Composable
fun ArtSpaceScreen() {

    var currentState by remember {
        mutableStateOf(1)
    }

    Surface(
        modifier = Modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        when (currentState) {
            1 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art1,
                        contentDescription = R.string.bouquets_of_flowers
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        flowersId = R.string.tulips,
                        bouquetID = R.string.bouquet_1,
                        priceId = R.string.price_1
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 6 },
                        onForward = { currentState = 2 }
                    )
                }
            }
            2 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art2,
                        contentDescription = R.string.bouquets_of_flowers
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        flowersId = R.string.alstroemeria,
                        bouquetID = R.string.bouquet_2,
                        priceId = R.string.price_2
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 1 },
                        onForward = { currentState = 3 })
                }
            }
            3 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art3,
                        contentDescription = R.string.bouquets_of_flowers
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        flowersId = R.string.roses,
                        bouquetID = R.string.bouquet_3,
                        priceId = R.string.price_3
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 2 },
                        onForward = { currentState = 4 })
                }
            }
            4 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art4,
                        contentDescription = R.string.bouquets_of_flowers
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        flowersId = R.string.gerberas,
                        bouquetID = R.string.bouquet_4,
                        priceId = R.string.price_4
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 3 },
                        onForward = { currentState = 5 })
                }
            }
            5 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art5,
                        contentDescription = R.string.bouquets_of_flowers
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        flowersId = R.string.gypsophila,
                        bouquetID = R.string.bouquet_5,
                        priceId = R.string.price_5
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 4 },
                        onForward = { currentState = 6 })
                }
            }
            6 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art6,
                        contentDescription = R.string.bouquets_of_flowers
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        flowersId = R.string.peonies,
                        bouquetID = R.string.bouquet_6,
                        priceId = R.string.price_6
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 5 },
                        onForward = { currentState = 7 })
                }
            }
            7 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    ArtWorkWall(
                        resourceDrawable = R.drawable.art7,
                        contentDescription = R.string.bouquets_of_flowers
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ArtDescriptor(
                        flowersId = R.string.asters,
                        bouquetID = R.string.bouquet_7,
                        priceId = R.string.price_7
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    DisplayController(
                        onBackward = { currentState = 6 },
                        onForward = { currentState = 1 })
                }
            }
        }
    }
}

@Composable
fun ArtWorkWall(
    resourceDrawable: Int,
    contentDescription: Int
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .border(
                BorderStroke(2.dp, Color.Gray)
            ),
        shadowElevation = 10.dp
    ) {
        Image(
            painter = painterResource(
                id = resourceDrawable
            ),
            contentDescription = stringResource(id = contentDescription),
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(20.dp)
        )
    }
}

@Composable
fun ArtDescriptor(
    flowersId: Int,
    bouquetID: Int,
    priceId: Int
) {
    Surface(
        shadowElevation = 10.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(text = stringResource(id = flowersId), fontSize = 18.sp)
            Row {
                Text(
                    text = stringResource(id = bouquetID),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = stringResource(id = priceId), fontSize = 16.sp)
            }
        }
    }
}

@Composable
fun DisplayController(
    onBackward: () -> Unit,
    onForward: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Bottom
    ) {
        Button(onClick = onBackward) {
            Text(
                text = stringResource(id = R.string.back),
                textAlign = TextAlign.Center,
                modifier = Modifier.width(100.dp)
            )
        }
        Button(
            onClick = onForward
        ) {
            Text(
                text = stringResource(id = R.string.next),
                textAlign = TextAlign.Center,
                modifier = Modifier.width(100.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        ArtSpaceScreen()
    }
}