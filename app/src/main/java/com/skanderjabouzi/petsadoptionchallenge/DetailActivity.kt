package com.skanderjabouzi.petsadoptionchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.skanderjabouzi.petsadoptionchallenge.ui.theme.PetsAdoptionChallengeTheme

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val pet = intent.getSerializableExtra("pet") as? Pet
        setContent {
            PetsAdoptionChallengeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    pet?.let {
                        PetDetail(it)
                    }
                }
            }
        }
    }
}

@Composable
fun PetDetail(pet: Pet) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = pet.name)
                }
            )
        }
    ) { innerPadding ->
        DisplayPet(pet)
    }
}

@Composable
fun DisplayPet(pet: Pet) {
    Column(
        Modifier
            .padding(8.dp)
            .fillMaxHeight() .
            verticalScroll(rememberScrollState())
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = pet.image),
                contentDescription = null,
                modifier = Modifier
                    .height(280.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(4.dp)),
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            pet.name,
            style = MaterialTheme.typography.h3
        )
        Spacer(modifier = Modifier.width(20.dp))
        Divider(color = Color.Black)
        Text(
            pet.description,
            style = MaterialTheme.typography.h4
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailPreview() {
    PetsAdoptionChallengeTheme {
        PetDetail(pets.first())
    }
}