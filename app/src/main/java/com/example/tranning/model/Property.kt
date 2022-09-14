package com.example.tranning.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Property(
    var propertyName: String? = null,
    var propertyLocation: String? = null
): Parcelable