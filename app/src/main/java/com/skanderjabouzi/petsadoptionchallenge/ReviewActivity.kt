package com.skanderjabouzi.petsadoptionchallenge

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.skanderjabouzi.petsadoptionchallenge.ui.theme.PetsAdoptionChallengeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetsAdoptionChallengeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    PetsPreview()
                }
            }
        }
    }
}

@Composable
fun PetsPreview() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text( text = stringResource(R.string.pets_title))
                }
            )
        }
    ) { innerPadding ->
        PetsList()
    }
}

@Composable
fun PetsList() {
    val scrollState = rememberLazyListState()
    LazyColumn(state = scrollState) {
        items(items = pets) { pet ->
            PetsListItem(pet)
            Divider(color = Color.White)
        }
    }
}

@Composable
fun PetsListItem(pet: Pet) {
    val context = LocalContext.current
    val intent = Intent(context, DetailActivity::class.java)
    Column(
        Modifier
            .padding(8.dp)
    ) {
        Row(
            Modifier
                .clickable(onClick = {
                    intent.putExtra("pet", pet)
                    context.startActivity(intent)
                }),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = pet.image),
                contentDescription = null,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(4.dp)),
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            pet.name,
            style = MaterialTheme.typography.subtitle1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PetsAdoptionChallengeTheme {
        PetsPreview()
    }
}