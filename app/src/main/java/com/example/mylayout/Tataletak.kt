package com.example.mylayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(20.dp)) {
        Text("Komponen1")
        Text("Komponen2")
        Text("Komponen3")
        Text("Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text("Komponen1")
        Text("Komponen2")
        Text("Komponen3")
        Text("Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text("Ini di dalam Box", fontWeight = FontWeight.Bold)
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Baris1-Komponen1")
            Text("Baris1-Komponen2")
            Text("Baris1-Komponen3")
        }
        Spacer(Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("Baris2-Komponen1")
            Text("Baris2-Komponen2")
            Text("Baris2-Komponen3")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Kolom1-Komponen1")
            Text("Kolom1-Komponen2")
            Text("Kolom1-Komponen3")
        }







