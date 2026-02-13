package com.example.artspaceapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.artspaceapp.model.Artwork

@Composable
fun ArtSpaceScreen(
    artwork: Artwork,
    canGoPrevious: Boolean,
    canGoNext: Boolean,
    onPrevious: () -> Unit,
    onNext: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ArtworkDisplay(
            artwork = artwork,
            modifier = Modifier.weight(1f)
        )

        Spacer(modifier = Modifier
            .height(16.dp))

        ArtworkInfo(artwork)

        Spacer(modifier = Modifier.height(24.dp))

        NavigationButtons(
            canGoPrevious = canGoPrevious,
            canGoNext = canGoNext,
            onPrevious = onPrevious,
            onNext = onNext
        )
    }
}