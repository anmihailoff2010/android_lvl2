package com.example.recyclerview_advanced.data.characters

import android.os.Parcelable
import com.example.recyclerview_advanced.entity.Origin
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class OriginDto(
    @Json(name = "name") override val name: String,
    @Json(name = "url") override val url: String
) : Origin, Parcelable