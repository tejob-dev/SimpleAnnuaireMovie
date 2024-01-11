package com.ericg.neatflix.util

import android.app.Application
import android.content.Context
import android.os.Build
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

object Constants {
    const val BASE_URL = "https://api.themoviedb.org/3/"
    const val BASE_BACKDROP_IMAGE_URL = "https://image.tmdb.org/t/p/w780/"
    const val BASE_POSTER_IMAGE_URL = "https://image.tmdb.org/t/p/w500/"
}
