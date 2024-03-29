package com.example.jetpack_compose.data.characters

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.example.jetpack_compose.entity.characters.Info
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class InfoDto(
    @Json(name = "count") override val count: Int?,
    @Json(name = "next") override val next: String?,
    @Json(name = "pages") override val pages: Int?
) : Info, Parcelable