package com.example.jetpack_compose.data.characters

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.example.jetpack_compose.entity.characters.Location
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class LocationDto(
    @Json(name = "name") override val name: String?,
    @Json(name = "url") override val url: String?
) : Location, Parcelable