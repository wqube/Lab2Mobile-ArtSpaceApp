package com.example.artspaceapp.ui

import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import com.example.artspaceapp.data.ArtworkRepository

@Composable
fun ArtSpaceApp() {
    // rememberSaveable - позволяет сохранять состояние при повороте экрана
    var currentIndex by rememberSaveable { mutableStateOf(0) }
    val artworks = ArtworkRepository.artworks

    ArtSpaceScreen (
        artwork = artworks[currentIndex],
        canGoPrevious = currentIndex > 0,
        canGoNext = currentIndex < artworks.lastIndex,
        onPrevious = { currentIndex-- },
        onNext = { currentIndex++ }
    )
}