package com.example.artspaceapp.ui

import com.example.artspaceapp.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun NavigationButtons(
    canGoPrevious: Boolean,
    canGoNext: Boolean,
    onPrevious: () -> Unit,
    onNext: () -> Unit,
) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Button(
            onClick = onPrevious,
            enabled = canGoPrevious,
            modifier = Modifier
                    .heightIn(min = 48.dp)
        ) {
            Text(stringResource(R.string.previous))
        }
        Button(
            onClick = onNext,
            enabled = canGoNext,
            modifier = Modifier
                .heightIn(min = 48.dp)
        ) {
            Text(stringResource(R.string.next))
        }
    }
}
