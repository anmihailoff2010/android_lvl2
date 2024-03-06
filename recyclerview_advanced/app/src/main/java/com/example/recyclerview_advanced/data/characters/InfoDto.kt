package com.example.recyclerview_advanced.data.characters

import android.os.Parcelable
import com.example.recyclerview_advanced.entity.Info
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class InfoDto(
    @Json(name = "count") override val count: Int?,
    @Json(name = "next") override val next: String?,
    @Json(name = "pages") override val pages: Int?
) : Info, Parcelable