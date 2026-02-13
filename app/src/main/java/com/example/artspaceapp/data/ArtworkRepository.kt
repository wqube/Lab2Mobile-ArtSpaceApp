package com.example.artspaceapp.data

import com.example.artspaceapp.R
import com.example.artspaceapp.model.Artwork

object ArtworkRepository {

    val artworks = listOf(
        Artwork(
            imageResId = R.drawable.zvezdnaya_noch,
            titleResId = R.string.art_1_title,
            authorResId = R.string.art_1_author_year
        ),
        Artwork(
            imageResId = R.drawable.che_rnyi__suprematicheskii__kvadrat__1915__gtg,
            titleResId = R.string.art_2_title,
            authorResId = R.string.art_2_author_year
        ),
        Artwork(
            imageResId = R.drawable.valentin_serov___devochka_s_persikami__portret_v_s_mamontovoi____google_art_project,
            titleResId = R.string.art_3_title,
            authorResId = R.string.art_3_author_year
        ),
        Artwork(
            imageResId = R.drawable.devusha_s_zhemchuzhnoi_serezhkoi,
            titleResId = R.string.art_4_title,
            authorResId = R.string.art_4_author_year
        ),
        Artwork(
            imageResId = R.drawable.postoyanstvo_pamyati,
            titleResId = R.string.art_5_title,
            authorResId = R.string.art_5_author_year
        )
    )
}