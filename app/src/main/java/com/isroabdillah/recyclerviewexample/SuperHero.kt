package com.isroabdillah.recyclerviewexample

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SuperHero(
    val name: String,
    val desc: String,
): Parcelable
