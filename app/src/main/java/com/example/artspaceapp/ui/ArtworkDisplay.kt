package com.example.artspaceapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.artspaceapp.model.Artwork

@Composable
fun ArtworkDisplay(
    artwork: Artwork,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(artwork.imageResId),
        contentDescription = stringResource(artwork.titleResId),
        modifier = modifier.fillMaxWidth(),
        contentScale = ContentScale.Fit
    )
}
